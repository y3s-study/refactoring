package refactoring.sb.ch07._02_move_field.example;

public class Account {
    private AccountType type;
    private double interestRate;

    double interestForAmountDays(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}
