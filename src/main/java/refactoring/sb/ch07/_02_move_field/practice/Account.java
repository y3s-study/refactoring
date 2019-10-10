package refactoring.sb.ch07._02_move_field.practice;

public class Account {
    private AccountType type;

    double interestForAmountDays(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }
}
