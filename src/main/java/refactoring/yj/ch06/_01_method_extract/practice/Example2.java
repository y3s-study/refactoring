package refactoring.yj.ch06._01_method_extract.practice;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    private List<Order> orders = new ArrayList<>();
    private String name;

    void printOwing() {
        List<Order> orders = this.orders;

        printBanner();
        double outstanding = getOutstanding(orders);
        printDetail(outstanding);
    }

    private void printBanner() {
        System.out.println("****************");
        System.out.println("*** 고객 외상 ***");
        System.out.println("****************");
    }

    private double getOutstanding(List<Order> orders) {
        double outstanding = 0.0;
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    private void printDetail(double outstanding) {
        System.out.println("고객명:" + name);
        System.out.println("외상액:" + outstanding);
    }
}
