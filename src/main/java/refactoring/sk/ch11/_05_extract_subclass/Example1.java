package refactoring.sk.ch11._05_extract_subclass;

public class Example1 {
    class Employee {
        private int rate;

        public Employee(int rate) {
            this.rate = rate;
        }

        public int getRate() {
            return rate;
        }
    }

    class JobItem {
        private int unitPrice;
        private int quantity;
        private Employee employee;
        private boolean isLabor;

        public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            this.employee = employee;
            this.isLabor = isLabor;
        }

        public int getTotalPrice() {
            return getUnitPrice() * quantity;
        }

        public int getUnitPrice() {
            return (isLabor) ? employee.getRate() : unitPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public Employee getEmployee() {
            return employee;
        }

        public boolean isLabor() {
            return isLabor;
        }
    }
}
