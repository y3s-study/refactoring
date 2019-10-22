package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.example;

public class Salesman extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
