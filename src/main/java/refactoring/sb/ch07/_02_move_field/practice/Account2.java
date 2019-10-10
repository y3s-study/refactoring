package refactoring.sb.ch07._02_move_field.practice;

public class Account2 {
    private AccountType type;

    double interestForAmountDays(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
       type.setInterestRate(interestRate);
    }
}
