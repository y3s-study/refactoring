package refactoring.sb.ch09._05_replace_nested_conditional_with_guard_clauses.practice;

public class Example1 {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    double getPayAmount() {
        if(isDead) return deadAmount();
        if(isSeparated) return separatedAmount();
        if(isRetired) return retiredAmount();
        return normalPayAmount();
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
