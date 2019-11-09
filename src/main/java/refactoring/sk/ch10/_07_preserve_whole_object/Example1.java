package refactoring.sk.ch10._07_preserve_whole_object;

public class Example1 {
    /*
        객체를 통째로 전달
        - 객체에서 가져온 여러 값을 메서드 호출에서 매개변수로 전달할 땐 그 객체를 통째로 전달하게 수정하자.

        private int low = daysTempRange().getLow();
        private int high = daysTempRange().getHigh();
        withinPlan = plan.withinRange(low, high);

        withinPlan = plan.withinRange(daysTempRange());
     */

    class Room {
        boolean withinPlan(HeatingPlan plan) {
            int low = daysTempRange().getLow();
            int high = daysTempRange().getHigh();
            return plan.withinRange(low, high);
        }

        public TempRange daysTempRange() {
            return new TempRange();
        }
    }

    class HeatingPlan {
        private TempRange range;

        boolean withinRange(int low, int high) {
            return (low >= range.getLow() && high <= range.getHigh());
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
    }
}
