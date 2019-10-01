package refactoring.yj.ch06._06_split_temp_var.practice;

public class Haggis {
    private double primaryForce;
    private double secondaryForce;
    private double mass;
    private int delay;

    public double getDistanceTravelled(int time) {
        return primaryDistance(time) + secondaryDistance(time);
    }

    private double primaryDistance(int time) {
        return 0.5 * primaryAcc() * primaryTime(time) * primaryTime(time);
    }

    private double secondaryDistance(int time) {
        if (secondaryTime(time) > 0) {
            return primaryVel() * secondaryTime(time) + 0.5 * secondaryAcc() * secondaryTime(time) * secondaryTime(time);
        } else {
            return 0;
        }
    }

    private int primaryTime(int time) {
        return Math.min(time, delay);
    }

    private int secondaryTime(int time) {
        return time - delay;
    }

    private double primaryAcc() {
        return primaryForce * mass;
    }

    private double primaryVel() {
        return primaryAcc() * delay;
    }

    private double secondaryAcc() {
        return (primaryForce + secondaryForce) / mass;
    }
}
