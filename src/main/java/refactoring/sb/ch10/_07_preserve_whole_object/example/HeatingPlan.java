package refactoring.sb.ch10._07_preserve_whole_object.example;

public class HeatingPlan {
    private TempRange range;
    boolean withinRange(int low, int high) {
        return (low >= range.getLow() && high <= range.getHigh());
    }
}
