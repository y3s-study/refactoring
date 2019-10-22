package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.example;

public class Engineer extends EmployeeType {
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
