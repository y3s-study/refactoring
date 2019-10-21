package refactoring.sb.ch09._01_decompose_conditional.practice;

import java.util.Date;

public class Example1 {
    Date date = new Date();
    Date SUMMER_START = new Date();
    Date SUMMER_END = new Date();
    double charge;

    double winterRate;
    int winterServiceCharge;
    double summerRate;
    int quantity;

    public void example1() {

        if(notSummer(date)) {
            charge = winterCharge(quantity);
        } else {
            charge = summerCharge(quantity);
        }
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private double summerCharge(int quantity) {
        return quantity * summerRate;
    }

    private double winterCharge(int quantity) {
        return quantity * winterRate * winterServiceCharge;
    }
}
