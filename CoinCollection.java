package HomeWork;

public class CoinCollection  {
    private int CoinCount ;
    private int age ;
    private String value ;
    
    public CoinCollection(int count , int age ,String coinValue){
        this.CoinCount = count ;
        this.age = age ;
        this.value = coinValue ;
    }

    public int getCoinCount() {
        return CoinCount;
    }

    public int getAge() {
        return age;
    }

    public String getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        CoinCollection EuropeanCoins = new CoinCollection(5,1500,"rare");
        
        System.out.println(EuropeanCoins.getValue());
        
        CoinCollection EgyptianCoins = new CoinCollection(15,10,"modren coins");
        
        System.out.println(EgyptianCoins.getCoinCount());
        
        CoinCollection ArabianCoins = new CoinCollection(3,1800,"very rare");
        
        System.out.println(ArabianCoins.getAge());
    }
}
