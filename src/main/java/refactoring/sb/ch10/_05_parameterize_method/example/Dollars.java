package refactoring.sb.ch10._05_parameterize_method.example;

public class Dollars {
    public Dollars(double result) {
    }

    protected Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        if(lastUsage() > 100) {
            result += (Math.min(lastUsage(), 200) - 100) * 0.05;
        }
        if(lastUsage() > 200) {
            result += (lastUsage() - 200) * 0.07;
        }
        return new Dollars(result);
    }

    private int lastUsage() {
        return 0;
    }
}
