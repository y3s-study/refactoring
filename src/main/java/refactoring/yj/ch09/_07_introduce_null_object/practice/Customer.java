package refactoring.yj.ch09._07_introduce_null_object.practice;

class Customer {
    private String name;
    private BillingPlan plan;
    private PaymentHistory history;

    String getName() {
        return name;
    }

    BillingPlan getPlan() {
        return plan;
    }

    PaymentHistory getHistory() {
        return history;
    }

    boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }
}
