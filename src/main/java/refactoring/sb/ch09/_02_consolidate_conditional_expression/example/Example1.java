package refactoring.sb.ch09._02_consolidate_conditional_expression.example;

public class Example1 {

    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if(seniority < 2) return 0;
        if(monthsDisabled > 12) return 0;
        if(isPartTime) return 0;

        return 0;
    }
}
