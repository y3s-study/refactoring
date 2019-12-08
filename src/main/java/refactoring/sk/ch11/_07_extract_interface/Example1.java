package refactoring.sk.ch11._07_extract_interface;

public class Example1 {
    interface Billable {
        public int getRate();

        public boolean hasSpecialSkill();
    }

    class Employee implements Billable {
        double charge(Billable emp, int days) {
            int base = emp.getRate() * days;
            if (emp.hasSpecialSkill())
                return base * 1.05;
            else return base;
        }

        @Override
        public int getRate() {
            return 0;
        }

        @Override
        public boolean hasSpecialSkill() {
            return false;
        }
    }

}
