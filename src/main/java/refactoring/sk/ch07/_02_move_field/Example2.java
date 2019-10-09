package refactoring.sk.ch07._02_move_field;

public class Example2 {
    private AccountType type;
    private double interestRate;

    double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }

    static class AccountType {
        private double interestRate;

        void setInterestRage(double interestRage) {
            interestRate = interestRage;
        }

        double getInterestRate() {
            return interestRate;
        }
    }
}
