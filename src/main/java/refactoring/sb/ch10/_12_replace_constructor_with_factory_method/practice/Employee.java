package refactoring.sb.ch10._12_replace_constructor_with_factory_method.practice;

public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private Employee() {

    }
    private Employee(int type) {
        this.type = type;
    }

    static Employee create(int type) {
        return new Employee(type);
    }
}
