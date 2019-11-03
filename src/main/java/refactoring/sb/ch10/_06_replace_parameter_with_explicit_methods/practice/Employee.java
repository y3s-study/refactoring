package refactoring.sb.ch10._06_replace_parameter_with_explicit_methods.practice;

public class Employee {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    // create 호출 부분을 모두 수정하면 위에 상수랑 같이 삭제
    static Employee create(int type) {
        switch(type) {
            case ENGINEER:
                return Employee.createEngineer();
            case SALESMAN:
                return Employee.createSalesman();
            case MANAGER:
                return Employee.createManager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static Employee createEngineer() {
        return new Engineer();
    }

    static Employee createSalesman() {
        return new Salesman();
    }

    static Employee createManager() {
        return new Manager();
    }


    static class Engineer extends Employee {}

    static class Salesman extends Employee {}

    static class Manager extends Employee {}
}
