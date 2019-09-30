package refactoring.yj.ch06._05_explaining_var.practice;

public class Order2 {
    private int quantity;
    private int itemPrice;

    public double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }
}
