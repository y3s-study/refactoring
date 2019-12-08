package refactoring.sk.ch11._02_pull_up_method;

import java.util.Date;

public class Example1 {
    abstract class Customer {
        public Date lastBillDate;

        public void addBill(Date date, double amount) {

        }

        private void createBill(Date date) {
            double chargeAmount = chargeFor(lastBillDate, date);
            addBill(date, chargeAmount);
        }

        abstract double chargeFor(Date start, Date end);

    }

    class RegularCustomer extends Customer {
        public double chargeFor(Date start, Date end) {
            return 0.0;
        }
    }

    class PreferredCustomer extends Customer {
        public double chargeFor(Date start, Date end) {
            return 0.0;
        }
    }
}
