package Archive.MyShop;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Order> cart = new ArrayList<Order>();

    public void addToCart(Order order, int ammount){
        if(ammount>0){
            order.quantity+=ammount;
            cart.add(order);
        }else{
            System.out.println("Invalid ammount");
        }
    }

    public void removeFromCart(Order order){
            cart.remove(order);
    }

    public double getTotalPrice(){
        double total = 0 ;
        for(Order x : cart){
            total+=x.getPrcie();
        }
        return total;
    }

    public void display(){
        System.out.println("***********************");
        System.out.println("Your Cart contents :-");
        for(Order order : cart){
            System.out.println(order.toString());
        }
        System.out.println("***********************");
    }
}