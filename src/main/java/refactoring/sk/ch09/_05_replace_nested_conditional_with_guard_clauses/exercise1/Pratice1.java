package refactoring.sk.ch09._05_replace_nested_conditional_with_guard_clauses.exercise1;

public class Pratice1 {

    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    double getPayAmount() {
        double result;
        if (isDead) result = deadAmount();
        else {
            if (isSeparated) result = separatedAmount();
            else {
                if (isRetired) result = retiredAmount();
                else result = normalPayAmount();
            }
        }
        return result;
    }

    private double deadAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double normalPayAmount() {
        return 0;
    }

}
