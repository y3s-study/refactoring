package refactoring.sb.ch07._08_introduce_local_extension.practice;

import java.util.Date;

public class MfDateSub extends Date {
    public MfDateSub(String dateString) {
        super (dateString);
    }

    public MfDateSub(Date arg) {
        super(arg.getTime());
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
