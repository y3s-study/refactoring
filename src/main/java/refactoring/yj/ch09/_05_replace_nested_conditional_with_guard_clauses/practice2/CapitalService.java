package refactoring.yj.ch09._05_replace_nested_conditional_with_guard_clauses.practice2;

public class CapitalService {
    private double capital;
    private double intRate;
    private double duration;
    private double income;

    private static final double ADJ_FACTOR = 1;

    double getAdjustedCapital() {
        if (capital <= 0.0) return 0.0;
        if (intRate <= 0.0 || duration <= 0.0) return 0.0;
        return (income / duration) * ADJ_FACTOR;
    }
}
