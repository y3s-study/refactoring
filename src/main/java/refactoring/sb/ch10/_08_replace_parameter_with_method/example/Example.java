package refactoring.sb.ch10._08_replace_parameter_with_method.example;

public class Example {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        int basePrice = quantity * itemPrice;
        int discountLevel;
        if(quantity > 100) discountLevel = 2;
        else discountLevel = 1;
        double finalPrice = discounttedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discounttedPrice(int basePrice, int discountLevel) {
        if(discountLevel == 2) return basePrice * 0.1;
        else return basePrice * 0.05;
    }
}
