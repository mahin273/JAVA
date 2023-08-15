import java.util.*;
public class SavingsAccount extends Account {
    private String creditCardNumber;
    private Calendar creditCardExpiryDate;
     public SavingsAccount() {
        super();
        creditCardNumber = "";
        creditCardExpiryDate = Calendar.getInstance();
    }
     public SavingsAccount(int id, double balance, double annualInterestRate, String creditCardNumber, Calendar creditCardExpiryDate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiryDate = creditCardExpiryDate;
    }
     public String getCreditCardNumber() {
        return creditCardNumber;
    }
     public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
     public Calendar getCreditCardExpiryDate() {
        return creditCardExpiryDate;
    }
     public void setCreditCardExpiryDate(Calendar creditCardExpiryDate) {
        this.creditCardExpiryDate = creditCardExpiryDate;
    }
     @Override
    public String getAccountType() {
        return "Savings Account";
    }

    public String getCreditBalance() {
         return getCreditBalance();
    }
}