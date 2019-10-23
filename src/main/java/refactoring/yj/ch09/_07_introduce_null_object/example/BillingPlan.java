package refactoring.yj.ch09._07_introduce_null_object.example;

class BillingPlan {
    static BillingPlan basic() {
        return new BillingPlan();
    }
}
