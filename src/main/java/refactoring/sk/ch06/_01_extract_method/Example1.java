package refactoring.sk.ch06._01_extract_method;

import java.util.Enumeration;
import java.util.Vector;

public class Example1 {
    private String _name = "test";
    private Vector<Order> _orders;

    void printOwing(double amount) {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;

        // 배너 출력
        System.out.println("********************");
        System.out.println("*******고객외상*******");
        System.out.println("********************");

        // 외상액 계산
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        // 세부 정보 출력
        System.out.println("name:" + _name);
        System.out.println("outstanding:" + outstanding);
    }
}