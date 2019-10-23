package refactoring.sk.ch09._07_introduce_null_object;

public class Customer implements Nullable {

    private String name;
    private BillingPlan plan;
    private PaymentHistory history;

    protected Customer() {
    }

    public String getName() {
        return name;
    }

    public BillingPlan getPlan() {
        return plan;
    }

    public PaymentHistory getHistory() {
        return history;
    }

    public boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }
}
