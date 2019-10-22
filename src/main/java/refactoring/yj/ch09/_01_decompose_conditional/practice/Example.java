package refactoring.yj.ch09._01_decompose_conditional.practice;

import java.util.Date;

/**
 * Decompose Conditional (조건문 쪼개기)
 * <p>
 * 복잡한 조건문(if-then-else)이 있을 땐
 * - if, then, else 부분을 각각 메서드로 빼내자
 */
public class Example {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();

    private int winterRate;
    private int summerRate;
    private int winterServiceCharge;

    void someMethod(Date date, int quantity) {
        int charge;

        if (notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private int winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }

    private int summerCharge(int quantity) {
        return quantity * summerRate;
    }
}
