package refactoring.sb.ch07._07_introduce_foreign_method.practice;

import java.util.Date;

public class Example {
    private Date previousEnd;

    public Example() {
        Date newStart = nextDay(previousEnd);
    }

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    public Date getPreviousEnd() {
        return previousEnd;
    }

    public void setPreviousEnd(Date previousEnd) {
        this.previousEnd = previousEnd;
    }
}
