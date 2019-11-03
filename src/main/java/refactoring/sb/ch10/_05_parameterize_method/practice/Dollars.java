package refactoring.sb.ch10._05_parameterize_method.practice;

public class Dollars {

    public Dollars(double result) {
    }

    protected Dollars baseCharge() {
        double result = usageInRange(0, 100) * 0.03;
        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return new Dollars(result);
    }

    protected int usageInRange(int start, int end) {
        if(lastUsage() > start) return Math.min(lastUsage(), end) - start;
        else return 0;
    }

    private int lastUsage() {
        return 0;
    }
}
