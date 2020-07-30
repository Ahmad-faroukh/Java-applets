
package Archive.Mall;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ProductOrder> products = new ArrayList<>();

    public ArrayList<ProductOrder> getProducts() {
        return products;
    }

    public void addToCart(ProductOrder productOrder, int amount) {
        if (productOrder.getProduct().getQuantity() > 0) {
            boolean isExist = false;
            for (ProductOrder orders : products) {
                if (orders.getProduct().getId() == productOrder.getProduct().getId())
                    isExist = true;
            }
            if (amount > 0 && amount < productOrder.getProduct().getQuantity()) {
                productOrder.addQuantity(amount);
                if (!isExist)
                    products.add(productOrder);
            } else if (amount >= productOrder.getProduct().getQuantity()) {
                System.out.println("You ordered more than the store has.\nYou've had only" +
                        productOrder.getProduct().getQuantity());
                productOrder.addQuantity(productOrder.getProduct().getQuantity());
                products.add(productOrder);
            }
        } else
            System.out.println("The store ran out of this product!!");
    }

    public void removeFromCart(ProductOrder productOrder, int amount) {
        if (productOrder.getQuantity() > 0) {
            if (amount > 0 && amount < productOrder.getQuantity())
                productOrder.removeQuantity(amount);
            else if (amount > 0 && amount >= productOrder.getQuantity()) {
                System.out.println("You've returned all you have of this product.");
                productOrder.removeQuantity(productOrder.getQuantity());
                products.remove(productOrder);
            }
        } else
            System.out.println("You don't have any of this product!!");
    }

    public void emptyCart() {
        for (ProductOrder orders : products)
            orders.setQuantity(0);
        products.clear();
    }

    public void display() {
        for (ProductOrder productOrder : products) {
            if (productOrder.getQuantity() > 0)
                System.out.println(productOrder);
        }
        System.out.println("");
    }

    public double getTotalPrice() {
        double total = 0;
        for (ProductOrder productOrder : products) {
            total += productOrder.getOrderPrice();
        }
        return total;
    }
}