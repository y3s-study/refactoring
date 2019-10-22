package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.example;

public class Employee {
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    int payAmount() {
        switch(getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("없는 사원입니다");
        }
    }

    public int getType() {
        return type.getTypeCode();
    }
}
