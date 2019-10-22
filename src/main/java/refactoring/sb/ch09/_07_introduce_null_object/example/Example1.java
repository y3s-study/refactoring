package refactoring.sb.ch09._07_introduce_null_object.example;

public class Example1 {
    Site site = new Site();

    public void example() {
        Customer customer = site.getCustomer();
        BillingPlan plan;

        if(customer == null) plan = BillingPlan.basic();
        else plan = customer.getBillingPlan();

        String customerName;
        if(customer == null) customerName = "occupant";
        else customerName = customer.getName();

        int weeksDelinquent;
        if(customer == null) weeksDelinquent = 0;
        else weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }
}
