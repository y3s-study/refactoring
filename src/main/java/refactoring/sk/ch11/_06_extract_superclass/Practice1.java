package refactoring.sk.ch11._06_extract_superclass;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    abstract class Party {
        protected Party(String name) {
            this.name = name;
        }

        protected String name;

        public String getName() {
            return name;
        }

        abstract public int getAnnualCost();
    }

    class Employee extends Party {
        private String name;
        private String id;
        private int annualCost;

        public Employee(String name, String id, int annualCost) {
            super(name);
            this.id = id;
            this.annualCost = annualCost;
        }

        public int getAnnualCost() {
            return annualCost;
        }

        public String getId() {
            return id;
        }
    }

    class Department extends Party {
        private String name;
        private List<Example1.Employee> staff = new ArrayList();

        public Department(String name) {
            super(name);
        }

        public int getAnnualCost() {
            return staff.stream().mapToInt(Example1.Employee::getAnnualCost).sum();
        }

        public int getHeadCount() {
            return staff.size();
        }

        public void addStaff(Example1.Employee employee) {
            staff.add(employee);
        }

        public List<Example1.Employee> getStaff() {
            return staff;
        }
    }
}
