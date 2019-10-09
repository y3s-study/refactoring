package refactoring.sk.ch07._01_move_method;

public class Example2 {
    private AccountType type;
    private int daysOverdrawn;

    private double overdraftCharge() {
        return type.overdraftCharge(daysOverdrawn);
    }

    private static class AccountType {
        public double overdraftCharge(int daysOverdrawn) {
            if (isPremium()) {
                double result = 10;
                if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
                return result;
            } else return daysOverdrawn * 1.75;
        }

        public boolean isPremium() {
            return true;
        }
    }
}
