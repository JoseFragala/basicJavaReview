package encapsulamento.exercise2.entities;

public class Customer{

    private int accountNumber;
    private String name;
    private double accountBalance;

    public Customer (int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);

    }
    public Customer (int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void deposit(double money){
        accountBalance += money;
    }

    public void withdrawal(double money){
        accountBalance = accountBalance - money - 5.00;
    }
    public String toString(){
        return "Account " 
            + accountNumber
            + ", Holder: "
            + name
            + ", "
            + "Balance: $"
            + String.format("%.2f", accountBalance);
          
    }


}