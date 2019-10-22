package refactoring.sb.ch09._07_introduce_null_object.practice;

public class BillingPlan {
    public static BillingPlan basic() {
        return new BillingPlan();
    }

    public static BillingPlan special() {
        return new BillingPlan();
    }
}
