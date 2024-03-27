package entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount;
        }else{
            System.out.println("Limite insuficiente");
        }
    }

    @Override
    public void withdrawn(double amount){
        super.withdrawn(amount);
        balance -=2;

    }
}
