package refactoring.yj.ch06._05_explaining_var.practice;

public class Order1 {
    private int quantity;
    private int itemPrice;

    public double price() {
        final int basePrice = quantity * itemPrice;
        final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100.0);

        return basePrice - quantityDiscount + shipping;
    }
}
