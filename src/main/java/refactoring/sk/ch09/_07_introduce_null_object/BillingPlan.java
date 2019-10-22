package refactoring.sk.ch09._07_introduce_null_object;

public class BillingPlan {
    public static BillingPlan basic() {
        return new BillingPlan();
    }
}
