package refactoring.sb.ch09._07_introduce_null_object.example;

public class Customer {
    private String name;
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
}
