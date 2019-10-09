package refactoring.yj.ch07._07_introduce_foreign_method.practice;

import java.time.LocalDate;

/**
 * Introduce Foreign Method
 * <p>
 * 사용중인 서버 클래스에 메서드를 추가해야 하는데 그 클래스를 수정할 수 없을 땐
 * - 클라이언트 클래스 안에 서버클래스를 첫번 째 인자로 받는 메서드를 작성하자.
 */
public class Payment {
    private LocalDate previousEnd;

    public Payment(LocalDate previousEnd) {
        this.previousEnd = previousEnd;
    }

    public void postponePayDate() {
        LocalDate newStart = nextDay(previousEnd);
        // do something
    }

    // LocalDate 클래스의 외래 메서드
    private static LocalDate nextDay(LocalDate localDate) {
        return LocalDate.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth() + 1);
    }
}
