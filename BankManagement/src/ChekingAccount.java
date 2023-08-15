public class ChekingAccount extends Account {
    private double overdraftLimit;
     public ChekingAccount() {
        super();
        overdraftLimit = 0.0;
    }
     public ChekingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }
     public double getOverdraftLimit() {
        return overdraftLimit;
    }
     public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
     @Override
    public String getAccountType() {
        return "Checking Account";
    }
}