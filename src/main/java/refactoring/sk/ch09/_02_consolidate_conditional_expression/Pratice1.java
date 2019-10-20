package refactoring.sk.ch09._02_consolidate_conditional_expression;

public class Pratice1 {
    public double disabilityAmout(double seniority, double monthsDisabled, boolean isParttime) {
        if (seniority < 2) return 0.0;
        if (monthsDisabled > 12) return 0.0;
        if (isParttime) return 0.0;
        // 장애인 공제액 산출
        return 1.0;
    }
}
