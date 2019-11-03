package refactoring.sb.ch10._09_introduce_parameter_object.practice;

import java.util.Date;

public class DateRange {
    private final Date start;
    private final Date end;

    DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    Date getStart() {
        return this.start;
    }

    Date getEnd() {
        return this.end;
    }

    boolean includes(Date arg) {
        return (arg.equals(start) ||
                arg.equals(end) ||
                        (arg.after(start) && arg.before(end)));
    }
}
