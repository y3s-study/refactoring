package refactoring.sb.ch10._09_introduce_parameter_object.practice;

import java.util.Date;

public class Entry {
    private double value;
    private Date chargeDate;

    Entry(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    Date getDate() {
        return this.chargeDate;
    }

    double getValue() {
        return value;
    }
}
