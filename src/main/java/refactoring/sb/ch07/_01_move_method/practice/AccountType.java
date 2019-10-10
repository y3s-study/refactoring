package refactoring.sb.ch07._01_move_method.practice;

public class AccountType {
    double overdraftCharge(int daysOverdrawn) {
        if(isPremium()) {
            double result = 10;
            if(daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else{
            return daysOverdrawn * 1.75;
        }
    }

    public boolean isPremium() {
        return true;
    }
}
