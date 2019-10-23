package refactoring.sk.ch09._01_decompose_conditional;

import java.util.Date;

public class Practice1 {
    private final static Date SUMMER_START = new Date("2019-07-01");
    private final static Date SUMMER_END = new Date("2019-09-30");

    public Double caculateCharge(Date date, Long quantity) {
        double charge;
        double summerRate = 0.5;
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            double winterRate = 0.8;
            double winterServiceCharge = 0.1;
            charge = quantity * winterRate + winterServiceCharge;
        } else
            charge = quantity + summerRate;
        return charge;
    }
}
