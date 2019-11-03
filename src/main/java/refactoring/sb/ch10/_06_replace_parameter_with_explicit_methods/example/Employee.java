package refactoring.sb.ch10._06_replace_parameter_with_explicit_methods.example;

import refactoring.sk.ch09._06_replace_conditional_with_polymorphism.Engineer;

public class Employee {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    static Employee create(int type) {
        switch(type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static class Engineer extends Employee {}

    static class Salesman extends Employee {}

    static class Manager extends Employee {}
}
