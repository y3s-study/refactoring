package refactoring.sk.ch11._02_pull_up_method;

import java.util.Date;

public class Practice1 {

    class Customer {
        private Date lastBillDate;

        private void addBill(Date date, double amount) {

        }
    }

    class RegularCustomer extends Customer {
        private void createBill(Date date) {

        }

        private void chargeFor(Date start, Date end) {

        }
    }

    class PreferredCustomer extends  Customer {
        private void createBill(Date date) {

        }

        private void chargeFor(Date start, Date end) {

        }
    }

}
