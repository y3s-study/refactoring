package refactoring.yj.ch06._01_method_extract.example;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    private List<Order> orders = new ArrayList<>();

    private String name;

    void printOwing() {
        List<Order> orders = this.orders;
        double outstanding = 0.0;

        // 배너 출력
        System.out.println("****************");
        System.out.println("*** 고객 외상 ***");
        System.out.println("****************");

        // 외상액 계산
        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        // 세부 내역 출력
        System.out.println("고객명:" + name);
        System.out.println("외상액:" + outstanding);
    }
}
