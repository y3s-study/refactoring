package refactoring.sk.ch09._05_replace_nested_conditional_with_guard_clauses.exercise2;

public class Practice2 {
    private static final double ADJ_FACTOR = 1;
    private double capital;
    private double intRate;
    private double duration;
    private double income;

    public double getAdjusetedCapital() {
        double result = 0.0;
        if (capital > 0.0) {
            if (intRate > 0.0 && duration > 0.0) {
                result = (income / duration) * ADJ_FACTOR;
            }
        }
        return result;
    }
}
