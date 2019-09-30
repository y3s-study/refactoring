package refactoring.yj.ch06._04.practice;

public class Order {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        return basePrice() * discountFactor();
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }

    private int basePrice() {
        return quantity * itemPrice;
    }
}
