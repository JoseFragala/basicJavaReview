package entites;

public final class SavingsAccount extends Account {
// using the keyword "final" the class SavingsAccount cannot be inherited, so cannot have a subclass of a final class

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override 
    public final void withdraw(double amount){
        balance -= amount;
    }
    // using the keyword "final" the method cannot be overrided.

    
    

}
