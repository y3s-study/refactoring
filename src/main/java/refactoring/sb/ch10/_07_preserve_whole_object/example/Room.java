package refactoring.sb.ch10._07_preserve_whole_object.example;

public class Room {
    private TempRange tempRange;

    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        return plan.withinRange(low, high);
    }

    private TempRange daysTempRange() {
        return tempRange;
    }

}
