package refactoring.sk.ch11._05_extract_subclass;

public class Practice1 {
    static class Employee {
        private int rate;

        public Employee(int rate) {
            this.rate = rate;
        }

        public int getRate() {
            return rate;
        }
    }

    static class JobItem {
        private int unitPrice;
        private int quantity;
        protected Employee employee;

        protected JobItem(int unitPrice, int quantity) {
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public int getTotalPrice() {
            return getUnitPrice() * quantity;
        }

        public int getUnitPrice() {
            return unitPrice;
        }

        protected boolean isLabor() {
            return false;
        }

        public int getQuantity() {
            return quantity;
        }

        public Employee getEmployee() {
            return employee;
        }
    }

    static class LaborItem extends JobItem {
        public LaborItem(int quantity, Employee employee) {
            super(0, quantity);
            this.employee = employee;
        }

        public Employee getEmployee() {
            return employee;
        }

        protected boolean isLabor() {
            return true;
        }

        public int getUnitPrice() {
            return employee.getRate();
        }
    }

    public static void main(String[] args) {
        Employee kent = new Employee(5);
        JobItem j2 = new LaborItem(10, kent);

    }
}
