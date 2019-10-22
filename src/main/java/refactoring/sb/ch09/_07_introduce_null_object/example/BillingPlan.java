package refactoring.sb.ch09._07_introduce_null_object.example;

public class BillingPlan {
    public static BillingPlan basic() {
        return new BillingPlan();
    }
}
