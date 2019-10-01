package refactoring.yj.ch06._07_remove_assign_to_param.example;

public class Discounter {
    public int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10_000) inputVal -= 4;
        return inputVal;
    }
}
