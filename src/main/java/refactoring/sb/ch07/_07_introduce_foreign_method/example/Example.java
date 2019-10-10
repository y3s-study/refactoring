package refactoring.sb.ch07._07_introduce_foreign_method.example;

import java.util.Date;

public class Example {
    private Date previousEnd;

    public Example() {
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

    public Date getPreviousEnd() {
        return previousEnd;
    }

    public void setPreviousEnd(Date previousEnd) {
        this.previousEnd = previousEnd;
    }
}
