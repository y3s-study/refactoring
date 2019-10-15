package refactoring.yj.ch08._01_self_encapsulated_field.practice;

public class CappedRange extends IntRange {
    private int cap;

    CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return this.cap;
    }

    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
