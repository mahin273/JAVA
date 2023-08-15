import java.util.Calendar;
 public abstract class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;
     public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = Calendar.getInstance();
    }
     public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = Calendar.getInstance();
    }
     public int getId() {
        return id;
    }
     public void setId(int id) {
        this.id = id;
    }
     public double getBalance() {
        return balance;
    }
     public void setBalance(double balance) {
        this.balance = balance;
    }
     public double getAnnualInterestRate() {
        return annualInterestRate;
    }
     public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
     public Calendar getDateCreated() {
        return dateCreated;
    }
     public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
     public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate();
    }
     public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
     public abstract String getAccountType();
}