
package HomeWork;

public class CreditCard {
    private long CardNumber;
    private String CardType;
    private String ExpirationDate;

    public void CardRenew(String newDate) {
        this.ExpirationDate = newDate ;
    }

    public void DisplayCard() {
        System.out.println(CardNumber);
        System.out.println(CardType);
        System.out.println(ExpirationDate);
    }
    
    public CreditCard(long CardNum , String CardTyp , String CardEx){
        this.CardNumber = CardNum;
        this.CardType = CardTyp;
        this.ExpirationDate = CardEx;
    }
    
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(404425863,"Visa","03/16");
        System.out.println("-------------");
        c1.DisplayCard();
        c1.CardRenew("04/19");
        System.out.println("-------------");
        c1.DisplayCard();
        System.out.println("-------------");
        CreditCard c2 = new CreditCard(402154879,"MasterCard","07/18");
        c2.DisplayCard();
        System.out.println("-------------");
        CreditCard c3 = new CreditCard(406369854,"Palpay","12/21");
        c3.DisplayCard();
        System.out.println("-------------");
    }
}
