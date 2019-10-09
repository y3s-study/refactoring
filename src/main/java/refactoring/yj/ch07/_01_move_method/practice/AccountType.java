package refactoring.yj.ch07._01_move_method.practice;

class AccountType {

    boolean isPremium() {
        return false;
    }

    double overdraftCharge(double daysOverdrawn) {
        if (isPremium()) {
            double result = 10;

            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }

            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

}
