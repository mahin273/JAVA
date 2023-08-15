public class Main {
    public static void main(String[] args) {
//BankAccount account = new BankAccount(1234,1000,"mahin","md.mahin.bd18@gmail.com",
//        "01996673592");
        BankAccount account =new BankAccount();
System.out.println(account.getAccountNumber());
System.out.println(account.getBalance());
//account.setPhoneNumber("1234578");
//account.setBalance(100000);
//account.setCustomerName("Mahin");
//account.setEmail("md.mahin.bd18@gmail.com");
//account.setAccountNumber(123212);
account.withdraw(100.0);
account.deposit(250.0);
account.withdraw(50);
account.withdraw(200);
account.deposit(99.75);
account.withdraw(45.45);
BankAccount account1 = new BankAccount("Tim","md.tim.bd18@gmail.com"
        ,"019967");
System.out.println("Account No: "+account1.getAccountNumber()
+" Name: "+account1.getCustomerName());
    }
}