package refactoring.sk.ch10._09_introduce_parameter_object;

import java.util.ArrayList;
import java.util.Date;

public class Pratice1 {
    class Entry {
        private double value;

        private Date chargeDate;

        Entry(double value, Date chargeDate) {
            this.value = value;
            this.chargeDate = chargeDate;
        }

        public double getValue() {
            return value;
        }

        public Date getDate() {
            return chargeDate;
        }
    }

    class Account {
        public double getFlowBetween(DateRange dateRange) {
            double result = 0.0;

            ArrayList<Entry> elements = new ArrayList();

            for (Entry each : elements) {
                if (dateRange.includes(each.getDate())) {
                    result += each.getValue();
                }
            }
            return result;
        }


    }

    class DateRange {
        private Date start;
        private Date end;

        DateRange(Date start, Date end) {
            this.start = start;
            this.end = end;
        }

        public Date getStart() {
            return start;
        }

        public Date getEnd() {
            return end;
        }

        private boolean includes(Date date) {
            return date.equals(this.getStart()) || date.equals(this.getEnd())
                    || (date.after(this.getStart()) && date.before(this.getEnd()));
        }
    }
}
