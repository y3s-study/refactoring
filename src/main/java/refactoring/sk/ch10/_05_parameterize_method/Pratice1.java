package refactoring.sk.ch10._05_parameterize_method;

public class Pratice1 {
    private double salary = 1;

    private void tenPercentRaise() {
        salary *= 1.1;
    }

    private void fivePercentRaise() {
        salary *= 1.05;
    }

    private void raise(double factor) {
        salary *= (1 + factor);
    }

    protected Dollars baseCharge() {
        double result = usageInRange(0, 100) * 0.03;
        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return new Dollars(result);
    }

    private int usageInRange(int start, int end) {
        if (lastUsage() > start) return Math.min(lastUsage(), end) - start;
        else return 0;
    }

    private int lastUsage() {
        return 0;
    }

    private class Dollars {
        public Dollars(double result) {
        }
    }
}
