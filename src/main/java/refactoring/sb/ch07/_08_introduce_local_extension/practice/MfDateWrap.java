package refactoring.sb.ch07._08_introduce_local_extension.practice;

import java.util.Date;

public class MfDateWrap {
    private Date original;

    public MfDateWrap(String dateString) {
        original = new Date(dateString);
    }

    public MfDateWrap(Date arg) {
        original = arg;
    }

    public int getYear() {
        return original.getYear();
    }

    public int getMonth() {
        return original.getMonth();
    }

    public int getDate() {
        return original.getDate();
    }

    public boolean equals(Object arg) {
        if(this == arg) {
            return true;
        }
        if(!(arg instanceof  MfDateWrap)) {
            return false;
        }

        MfDateWrap other = (MfDateWrap) arg;
        return original.equals(other.original);
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
