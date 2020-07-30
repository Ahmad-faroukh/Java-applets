package Archive.Store;

public class ItemOrder {

    Item item ;
    int quantity ;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrcie(){
        return item.priceFor(quantity);
    }

    @Override
    public String toString() {
        return item.getName() + "\tquantity : " + quantity ;
    }
}