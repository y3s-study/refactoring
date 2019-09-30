package refactoring.yj.ch06._01_method_extract.practice;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    private List<Order> orders = new ArrayList<>();
    private String name;

    void printOwing() {
        List<Order> orders = this.orders;
        double outstanding = 0.0;

        printBanner();

        // 외상액 계산
        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        printDetail(outstanding);
    }

    private void printDetail(double outstanding) {
        System.out.println("고객명:" + name);
        System.out.println("외상액:" + outstanding);
    }

    private void printBanner() {
        System.out.println("****************");
        System.out.println("*** 고객 외상 ***");
        System.out.println("****************");
    }
}
