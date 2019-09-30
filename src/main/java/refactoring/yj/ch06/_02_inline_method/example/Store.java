package refactoring.yj.ch06._02_inline_method.example;

public class Store {
    private int numberOfLateDeliveries = 0;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
