package refactoring.sk.ch09._07_introduce_null_object;

public class Practice1 {
    /*
    null 검사를 대행하는 null 객체 생성

    Customer -> Null Customer

    */
//    if(customer == null) plan = BillingPlan.basic();
//    else plan = customer.getPlan();
    public static void main(String[] args) {
        Site site = new Site();

        Customer customer = site.getCusmoter();
        BillingPlan plan;

        if (customer.isNull()) plan = BillingPlan.basic();
        else plan = customer.getPlan();

//        String customerName;
//        if (customer.isNull()) customerName = "occupant";
//        else customerName = customer.getName();
        String customerName = customer.getName();

        int weeksDeliquent;
        if (customer.isNull()) weeksDeliquent = 0;
        else weeksDeliquent = customer.getHistory().getWeekDelinquentInLastYesr();
    }
}
