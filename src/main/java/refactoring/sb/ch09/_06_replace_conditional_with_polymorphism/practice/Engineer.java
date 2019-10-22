package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.practice;

public class Engineer {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
