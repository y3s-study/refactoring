package refactoring.yj.ch06._05_explaining_var.practice;

public class Order2 {
    private int quantity;
    private int itemPrice;

    public double price() {
        // 결제액(price) = 총 구매액(base price) - 대량 구매 할인(quantity discount) + 배송비(shipping)
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
