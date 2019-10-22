package refactoring.sk.ch09._06_replace_conditional_with_polymorphism;

public class Pratice1 {

    private static final String EUROPEAN = "eoropean";
    private static final String AFRICAN = "african";
    private static final String NORWEGIAN_BLUE = "norwegian_blue";

    private double numberOfCoconuts = 1;
    private boolean isNailed;
    private Integer voltage;

    double getSpeed(String type) {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("불가능한 속도");
    }

    private double getBaseSpeed() {
        return 0;
    }

    private double getLoadFactor() {
        return 0;
    }

    private double getBaseSpeed(Integer voltage) {
        return 0;
    }
}
