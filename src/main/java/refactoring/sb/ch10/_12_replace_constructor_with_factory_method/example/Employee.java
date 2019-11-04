package refactoring.sb.ch10._12_replace_constructor_with_factory_method.example;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        this.type = type;
    }
}
