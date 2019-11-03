package refactoring.sb.ch10._08_replace_parameter_with_method.practice;

public class Example {
    private int quantity;
    private int itemPrice;

    public double getPrice() {
        if(getDiscountLevel() == 2) return getBasePrice() * 0.1;
        else return getBasePrice() * 0.05;
    }

    private int getDiscountLevel() {
        if(quantity > 100) return 2;
        else return 1;
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }
}
