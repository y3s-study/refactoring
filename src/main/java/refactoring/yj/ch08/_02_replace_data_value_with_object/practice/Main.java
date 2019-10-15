package refactoring.yj.ch08._02_replace_data_value_with_object.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("c1"));
        orders.add(new Order("c2"));
        orders.add(new Order("c3"));

        int count = numberOfOrdersFor(orders, "c2");
        System.out.println(count);
    }

    private static int numberOfOrdersFor(Collection<Order> orders,String customer) {
        int result = 0;
        for (Order order : orders) {
            if (order.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
