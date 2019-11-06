package refactoring.sk.ch10._06_replace_parameter_with_explicit_methods;

/*
Employee kent = Employee.create(ENGINEER);
Employee kent = Employee.createEngineer();
*/

public class Example2 {
    static final int ENGHINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGHINEER:
                return Employee.createEngineer();
            case SALESMAN:
                return Employee.createSalesman();
            case MANAGER:
                return Employee.createManager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static class Employee {
        private static Manager createManager() {
            return new Manager();
        }

        private static Salesman createSalesman() {
            return new Salesman();
        }

        private static Engineer createEngineer() {
            return new Engineer();
        }

    }

    static class Engineer extends Employee {

    }

    static class Salesman extends Employee {

    }

    static class Manager extends Employee {

    }

}
