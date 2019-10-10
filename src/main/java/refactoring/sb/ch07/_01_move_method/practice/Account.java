package refactoring.sb.ch07._01_move_method.practice;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    double overdraftCharge() {
        return type.overdraftCharge(daysOverdrawn);
    }

    double bankCharge() {
        double result = 4.5;
        if(daysOverdrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}
