package refactoring.sb.ch09._01_decompose_conditional.example;

import java.util.Date;

public class Example1 {
    Date date = new Date();
    Date SUMMER_START = new Date();
    Date SUMMER_END = new Date();
    double charge;

    int quantity = 0;
    double winterRate;
    int winterServiceCharge;
    double summerRate;

    public void example1() {

        if(date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate * winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }
}
