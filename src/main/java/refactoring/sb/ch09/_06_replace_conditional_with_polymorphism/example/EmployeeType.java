package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.example;

abstract class EmployeeType {
    abstract int getTypeCode();

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}

