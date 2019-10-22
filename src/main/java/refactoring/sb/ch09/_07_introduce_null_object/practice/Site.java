package refactoring.sb.ch09._07_introduce_null_object.practice;

import refactoring.sb.ch09._07_introduce_null_object.practice.Customer;

public class Site {
    private Customer customer;
    public Customer getCustomer() {
        return (customer == null) ? Customer.newNull() : customer;
    }
}
