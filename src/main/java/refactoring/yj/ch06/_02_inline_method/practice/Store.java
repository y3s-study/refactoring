package refactoring.yj.ch06._02_inline_method.practice;

public class Store {
    private int numberOfLateDeliveries = 0;

    int getRating() {
        return (numberOfLateDeliveries > 5) ? 2 : 1;
    }
}
