package refactoring.yj.ch09._05_replace_nested_conditional_with_guard_clauses.practice1;

/**
 * Replace Nested Conditional with Guard Clauses (여러 겹의 조건문을 감시 절로 전환)
 * <p>
 * 메서드에 조건문이 있어서 정상적인 실행 경로를 파악하기 힘들 땐
 * - 모든 특수한 경우에 감시 절을 사용하자.
 */
public class PayService {
    private boolean isDead;
    private boolean isRetired;
    private boolean isSeperated;

    double getPayAmount() {
        if (isDead) return deadAmount();
        if (isSeperated) return separatedAmount();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
    }

    private double normalPayAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
