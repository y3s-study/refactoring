package refactoring.sk.ch10._07_preserve_whole_object;

public class Practice1 {
    class Room {
        boolean withinPlan(HeatingPlan plan) {
//            int low = daysTempRange().getLow();
//            int high = daysTempRange().getHigh();

            return plan.withinRange(new TempRange());
        }

//        public TempRange daysTempRange() {
//            return new TempRange();
//        }
    }

    class HeatingPlan {
        TempRange range;

        boolean withinRange(TempRange roomRange) {
            return range.includes(roomRange);
        }
    }

    class TempRange {
        private int low;
        private int high;

        public int getLow() {
            return 0;
        }

        public int getHigh() {
            return 0;
        }

        public boolean includes(TempRange roomRange) {
            return (roomRange.getLow() >= this.getLow() && roomRange.getHigh() <= this.getHigh());
        }
    }
}
