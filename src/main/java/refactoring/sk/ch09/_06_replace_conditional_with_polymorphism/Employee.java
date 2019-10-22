package refactoring.sk.ch09._06_replace_conditional_with_polymorphism;

public class Employee {

    private EmployeeType type = new Engineer();
    private int monthlySalary = 0;
    private int commission = 1;
    private int bonus = 2;

    public int payAmount() {
        return type.payAmount(this);
    }

    public int getBonus() {
        return bonus;
    }

    public int getCommission() {
        return commission;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
}
