package refactoring.sb.ch07._02_move_field.practice;

public class AccountType {

    private double interestRate;

    public boolean isPremium() {
        return true;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
