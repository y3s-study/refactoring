package refactoring.sb.ch09._05_replace_nested_conditional_with_guard_clauses.example;

public class Example2 {
    private static final double ADJ_FACTOR = 0;
    private double capital;
    private double intRate;
    private double duration;
    private double income;

    public double getAdjustedCapital() {
        double result = 0.0;
        if(capital > 0.0) {
            if(intRate > 0.0 && duration > 0.0) {
                result = (income / duration) * ADJ_FACTOR;
            }
        }
        return result;
    }
}
