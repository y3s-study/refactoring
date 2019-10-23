package refactoring.sk.ch09._02_consolidate_conditional_expression;

public class Example1 {
    public double disabilityAmout(double seniority, double monthsDisabled, boolean isParttime) {
        if (isNotEligableForDisability(seniority, monthsDisabled, isParttime)) return 0.0;
        // 장애인 공제액 산출
        return 1.0;
    }

    private boolean isNotEligableForDisability(double seniority, double monthsDisabled, boolean isParttime) {
        return seniority < 2 || monthsDisabled > 12 || isParttime;
    }
}
