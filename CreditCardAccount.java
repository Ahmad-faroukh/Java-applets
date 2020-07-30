
package HomeWork;

public class CreditCardAccount {
    private long CardNumber;
    private String CardHolderName;
    private int balance;

    public void charge(int ammount) {
        if(ammount>0){
         this.balance += ammount ;
        }
    }

    public void withdraw(int ammount) {
        if (ammount<balance){
            balance-=ammount;
        }
    }
    
    public CreditCardAccount(long CardNum , String name){
        this.CardNumber = CardNum;
        this.CardHolderName = name;
        this.balance = 0;
    }

    public long getCardNumber() {
        return CardNumber;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public int getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        CreditCardAccount AC1 = new CreditCardAccount(462157897,"Ahmad");
        AC1.charge(100);
        System.out.println(AC1.getBalance());
        AC1.withdraw(35);
        System.out.println(AC1.getBalance());
        CreditCardAccount AC2 = new CreditCardAccount(478894965,"Jmal");
        System.out.println(AC2.getCardHolderName());
        CreditCardAccount AC3 = new CreditCardAccount(478498568,"Hassan");
        System.out.println(AC3.getCardNumber());
    }
}
