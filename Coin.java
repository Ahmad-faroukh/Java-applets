package HomeWork;

public class Coin {
    private int size ;
    private int weight ;
    private String face ;
    
    public Coin(int size , int weight){
        this.size = size ; 
        this.weight = weight;
        this.face = "heads";
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getFace() {
        return face;
    }
    
    public static void main(String[] args) {
        Coin CopperCoin = new Coin(2,5);
        System.out.println(CopperCoin.getFace());
        Coin StealCoin = new Coin(3,7);
        System.out.println(StealCoin.getSize());
        Coin BrassCoin = new Coin(4,9);
        System.out.println(BrassCoin.getWeight());
    }
}
