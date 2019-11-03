package refactoring.sb.ch10._07_preserve_whole_object.practice;


public class HeatingPlan {
    private TempRange range;
    boolean withinRange(TempRange roomRange) {
        return range.includes(roomRange);
    }
}
