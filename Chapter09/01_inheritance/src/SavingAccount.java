public class SavingAccount extends BankAccout {
    private double interest;

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void addInterest() {
        setBalance((int) (getBalance() * (1 + interest)));
    }
}
