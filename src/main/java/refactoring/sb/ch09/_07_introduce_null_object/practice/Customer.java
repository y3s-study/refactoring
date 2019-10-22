package refactoring.sb.ch09._07_introduce_null_object.practice;

import refactoring.sb.ch09._07_introduce_null_object.practice.PaymentHistory;

public class Customer implements Nullable {
    private String name;

    public void setBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
    }

    private BillingPlan billingPlan;
    private PaymentHistory paymentHistory;

    public String getName() {
        return name;
    }

    public BillingPlan getBillingPlan() {
        return billingPlan;
    }

    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }
    static Customer newNull() {
        return new NullCustomer();
    }

    public boolean isNull() {
        return false;
    }

    protected Customer() {}
}
