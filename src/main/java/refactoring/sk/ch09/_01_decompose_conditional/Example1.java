package refactoring.sk.ch09._01_decompose_conditional;

import java.util.Date;

public class Example1 {
    private final static Date SUMMER_START = new Date("2019-07-01");
    private final static Date SUMMER_END = new Date("2019-09-30");

    public Double caculateCharge(Date date, Long quantity) {
        double summerRate = 0.5;
        if (notSummer(date)) {
            double winterRate = 0.8;
            double winterServiceCharge = 0.1;
            return getCharge(quantity, winterRate, winterServiceCharge);
        } else
            return getCharge(quantity, summerRate);
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private double getCharge(Long quantity, double summerRate) {
        return quantity + summerRate;
    }

    private double getCharge(Long quantity, double winterRate, double winterServiceCharge) {
        return quantity * winterRate + winterServiceCharge;
    }
}
