public class BankAccount {
  private   int accountNumber;
   private double balance;
    private String customerName;
  private   String email;
    String phoneNumber;
    public BankAccount(){
        this(12345,2.50,"Default name","Defalut address","9942379823742");
        System.out.println("Empty Constructor called");
    }
    public BankAccount(int accountNumber,double balance,String customerName,String email,String phoneNumber){
        System.out.println("Account constructor with parameter is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999,100.5,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made.New balance is $" + balance);
    }
    public void withdraw(double withdrawlAmount){
        if(balance - withdrawlAmount<0){
            System.out.println("Insufficient Amount.Your balance is $"+balance);
        }
        else {
            balance-=withdrawlAmount;
            System.out.println("You withdraw $"+withdrawlAmount+" Your Remaining balance is $"+balance);
        }

    }
public int getAccountNumber(){
    return accountNumber;
}
public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
}
public double getBalance(){
    return balance;
}
public void setBalance(double balance){
    this.balance = balance;
}
public String getCustomerName()
{
    return customerName;
}
public void setCustomerName(String customerName){
    this.customerName = customerName;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String getPhoneNumber(){
    return  phoneNumber;
}
public void setPhoneNumber(String number)
{
    this.phoneNumber = phoneNumber;
}

}
