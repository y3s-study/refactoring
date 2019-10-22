package refactoring.sb.ch09._06_replace_conditional_with_polymorphism.practice;

public class Employee {
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    int payAmount() {
       return type.payAmount(this);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
