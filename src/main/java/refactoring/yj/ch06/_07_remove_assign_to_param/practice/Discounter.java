package refactoring.yj.ch06._07_remove_assign_to_param.practice;

public class Discounter {
    public int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10_000) result -= 4;
        return result;
    }
}
