package refactoring.sk.ch10._15_replace_exception_with_test;

public class Example1 {
    // 예외는 사전에 예상치 못한 것을 잡기 위해서 사용해야지 남용 해서는 안된다.
    // 이미 예상한이 가능한 부분은 예외처리가 아닌 테스트 코드를 넣어 처리한다.

    private double[] values;

    public double getValueForPeriod(int periodNumber) {
        try {
            return values[periodNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public double getValueForPeriod2(int periodNumber) {
        if (periodNumber >= values.length) return 0;
        else return values[periodNumber];
    }
}
