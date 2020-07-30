package Archive.SavingAccount;

public class AccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        SavingAccount.modifyInterestRate(4);
        System.out.println("Monthly Interest for saver1: " + saver1.calculateMonthlyInterest() + " $");
        saver1.displaySavings();
        System.out.println("Monthly Interest for saver2: " + saver2.calculateMonthlyInterest() + " $");
        saver2.displaySavings();
        System.out.println("");
        SavingAccount.modifyInterestRate(5);
        System.out.println("Monthly Interest for saver1: " + saver1.calculateMonthlyInterest()+ " $");
        saver1.displaySavings();
        System.out.println("Monthly Interest for saver2: " + saver2.calculateMonthlyInterest() + " $");
        saver2.displaySavings();
    }
}
