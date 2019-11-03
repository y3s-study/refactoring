package refactoring.sk.ch10._05_parameterize_method;

public class Example1 {
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
        double result = Math.min(lastUsage(), 100) * 0.03;
        if (lastUsage() > 100) {
            result += (Math.min(lastUsage(), 200) - 100) * 0.05;
        }
        if (lastUsage() > 200) {
            result += (lastUsage() - 200) * 0.07;
        }
        return new Dollars(result);
    }

    private double lastUsage() {
        return 0.0;
    }

    private class Dollars {
        public Dollars(double result) {
        }
    }
}
