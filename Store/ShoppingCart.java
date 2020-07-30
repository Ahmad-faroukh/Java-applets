package Archive.Store;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<ItemOrder> items = new ArrayList<ItemOrder>();

    public void addToCart(ItemOrder itemOrder , int ammount){
        if(ammount>0){
            itemOrder.quantity+=ammount;
            items.add(itemOrder);
        }else{
            System.out.println("Invalid ammount");
        }
    }

    public void removeFromCart(ItemOrder itemOrder){
            items.remove(itemOrder);
    }

    public double getTotalPrice(){
        double total = 0 ;
        for(ItemOrder x : items){
            total+=x.getPrcie();
        }
        return total;
    }

    public void display(){
        System.out.println("***********************");
        System.out.println("Your Cart contents :-");
        for(ItemOrder item : items){
            System.out.println(item.toString());
        }
        System.out.println("***********************");
    }
}