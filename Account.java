public class Account {
    protected double balance;

    public Account(double initLabnce){
        balance = initLabnce;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit (double amt){
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt){
        balance -= amt;
        return true;
    }


}
