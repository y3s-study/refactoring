package refactoring.yj.ch08._02_replace_data_value_with_object.practice;

/**
 * Replace Data Value with Object (데이터 값을 객체로 전환)
 * <p>
 * 데이터 항목에 데이터나 기능을 더 추가해야 할 때는
 * - 데이터 항목을 객체로 만들자.
 */
public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }
}
