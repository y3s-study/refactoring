package refactoring.sk.ch06._01_extract_method;

import java.util.Enumeration;
import java.util.Vector;

public class Example2 {
    private String _name = "test";
    private Vector<Order> _orders;

    void printOwing(double previousAmount) {
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetail(outstanding);
    }

    private void printBanner() {
        System.out.println("********************");
        System.out.println("*******고객외상*******");
        System.out.println("********************");
    }

    private void printDetail(double amount) {
        System.out.println("name:" + _name);
        System.out.println("amount:" + amount);
    }

    private double getOutstanding(double initialValue) {
        Enumeration e = _orders.elements();
        double result = initialValue;
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }
}
