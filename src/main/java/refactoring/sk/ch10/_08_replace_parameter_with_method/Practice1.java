package refactoring.sk.ch10._08_replace_parameter_with_method;

public class Practice1 {
    int quantity = 0;
    int itemPrice = 0;
    int discountLevel = 0;

    public double getPrice() {
        int basePrice = quantity * itemPrice;
        discountLevel = getDiscountLevel();
        double finalPrice = discountedPrice(basePrice);
        return finalPrice;
    }

    private int getDiscountLevel() {
        if (quantity > 100) return 2;
        else return 1;
    }

    private double discountedPrice(int basePrice) {
        if (getDiscountLevel() == 2) return basePrice * 0.1;
        else return basePrice * 0.05;
    }
}
