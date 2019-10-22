package refactoring.sb.ch09._07_introduce_null_object.practice;

import refactoring.sb.ch09._07_introduce_null_object.practice.Customer;

public class NullCustomer extends Customer {
    public boolean isNull() {
        return true;
    }

    public String getName() {
        return "occupant";
    }

    public void setPlan(BillingPlan arg) {
    }

    public PaymentHistory getHistory() {
        return PaymentHistory.newNull();
    }
}
