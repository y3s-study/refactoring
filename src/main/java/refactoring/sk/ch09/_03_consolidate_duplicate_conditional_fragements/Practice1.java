package refactoring.sk.ch09._03_consolidate_duplicate_conditional_fragements;

public class Practice1 {
    public void method() {
        double total = 0;
        double price = 0;
        if (isSpecialDeal()) {
            total = price * 0.95;
            send();
        } else {
            total = price * 0.98;
            send();
        }
    }

    private boolean isSpecialDeal() {
        return true;
    }

    private void send() {
    }
}
