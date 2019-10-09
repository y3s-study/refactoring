package refactoring.sk.ch07._01_move_method;

public class Example1 {
    private AccountType type;
    private int daysOverdrawn;

    private double overdraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
            return result;
        } else return daysOverdrawn * 1.75;
    }

    private static class AccountType {
        public double overdraftCharge() {
            return 0.0;
        }

        public boolean isPremium() {
            return true;
        }
    }
}
