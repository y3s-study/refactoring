package refactoring.sk.ch11._06_extract_superclass;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    class Employee {
        private String name;
        private String id;
        private int annualCost;

        public Employee(String name, String id, int annualCost) {
            this.name = name;
            this.id = id;
            this.annualCost = annualCost;
        }

        public int getAnnualCost() {
            return annualCost;
        }
    }

    class Department {
        private String name;
        private List<Employee> staff = new ArrayList();

        public Department(String name) {
            this.name = name;
        }

        public int getTotalAnnualCost() {
            return staff.stream().mapToInt(Employee::getAnnualCost).sum();
        }

        public int getHeadCount() {
            return staff.size();
        }

        public void addStaff(Employee employee) {
            staff.add(employee);
        }

        public List<Employee> getStaff() {
            return staff;
        }

        public String getName() {
            return name;
        }
    }
}
