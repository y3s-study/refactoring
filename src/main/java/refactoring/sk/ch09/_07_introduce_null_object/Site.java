package refactoring.sk.ch09._07_introduce_null_object;

public class Site {

    private Customer customer;

    Customer getCusmoter() {
        return customer == null ? Customer.newNull() : customer;
    }
}
