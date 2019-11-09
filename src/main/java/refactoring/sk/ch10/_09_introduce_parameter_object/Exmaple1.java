package refactoring.sk.ch10._09_introduce_parameter_object;

import java.util.ArrayList;
import java.util.Date;

public class Exmaple1 {
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
        public double getFlowBetween(Date start, Date end) {
            double result = 0.0;

            ArrayList<Entry> elements = new ArrayList();

            for (Entry each : elements) {
                if (each.getDate().equals(start) || each.getDate().equals(end)
                        || (each.getDate().after(start) && each.getDate().before(end))) {
                    result += each.getValue();
                }
            }

            return result;
        }
    }

}
