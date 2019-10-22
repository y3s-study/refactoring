package refactoring.yj.ch09._06_replace_conditional_with_polymorphism.practice;

/**
 * Replace Conditional with Polymorphism (조건문을 재정의로 전환)
 * <p>
 * 객체 타입에 따라 다른 기능을 실행하는 조건문이 있을 땐
 * - 조건문의 각 절을 하위클래스의 재정의 메서드 안으로 옮기고, 원본 메서드는 abstract 타입으로 수정하자.
 */
public class Employee {

    private int monthlySalary;
    private int commission;
    private int bonus;
    private EmployeeType type;

    int payAmount() {
        return type.payAmount(this);
    }

    private int getType() {
        return type.getTypeCode();
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
