package refactoring.sb.ch09._07_introduce_null_object.practice;

import refactoring.sb.ch09._07_introduce_null_object.practice.BillingPlan;
import refactoring.sb.ch09._07_introduce_null_object.practice.Customer;
import refactoring.sb.ch09._07_introduce_null_object.practice.Site;

public class Example1 {
    Site site = new Site();

    public void example() {
        Customer customer = site.getCustomer();
        BillingPlan plan;

//        if(customer.isNull()) plan = BillingPlan.basic();
//        else plan = customer.getBillingPlan();
//
//        String customerName;
//        if(customer.isNull()) customerName = "occupant";
//        else customerName = customer.getName();
//
//        int weeksDelinquent;
//        if(customer.isNull()) weeksDelinquent = 0;
//        else weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();

        if(!customer.isNull()) {
            customer.setBillingPlan(BillingPlan.special());
        }

        customer.setBillingPlan((BillingPlan.special()));

        String customerName = customer.getName();

        int weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }
}
