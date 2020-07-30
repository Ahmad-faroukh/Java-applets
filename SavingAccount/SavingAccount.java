package Archive.SavingAccount;

public class SavingAccount {
    private static double annualIntrestRate;
    private double savingsBalance;
    private double monthlyIntrest;

    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualIntrestRate = newInterestRate / 100;
    }

    public double calculateMonthlyInterest() {
        monthlyIntrest = savingsBalance * annualIntrestRate / 12;
        return monthlyIntrest = Math.round(monthlyIntrest*10)/10.0;
    }

    public static void setAnnualIntrestRate(double annualIntrestRate) {
        SavingAccount.annualIntrestRate = annualIntrestRate/100;
    }

    private void calculateSavings() {
        savingsBalance += monthlyIntrest;
    }

    public void displaySavings() {
        calculateSavings();
        System.out.println("The total balance after one month : " + savingsBalance +"$");
    }
}