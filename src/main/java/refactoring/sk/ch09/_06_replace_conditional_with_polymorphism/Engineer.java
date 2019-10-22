package refactoring.sk.ch09._06_replace_conditional_with_polymorphism;

public class Engineer extends EmployeeType {
    @Override
    int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }
}
