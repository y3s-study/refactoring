package refactoring.sb.ch09._02_consolidate_conditional_expression.practice;

public class Example1 {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

//    double disabilityAmount() {
//        if((seniority < 2) || (monthsDisabled > 12) || (isPartTime)) return 0;
//
//        return 0;
//    }

    double disabilityAmount() {
        if(isNotEligibleForDisability()) return 0;

        return 0;
    }

    boolean isNotEligibleForDisability() {
        return (seniority < 2) || (monthsDisabled > 12) || (isPartTime);
    }
}
