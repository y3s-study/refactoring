package refactoring.sb.ch09._03_consolidate_duplicate_conditional_fragments.practice;

public class Example1 {

    private double total;
    private double price;

    public void example1() {
        if(isSpecialDeal()) {
            total = price * 0.95;
        } else {
            total = price * 0.98;
        }
        send();
    }

    private void send() {
    }

    private boolean isSpecialDeal() {
        return true;
    }
}
