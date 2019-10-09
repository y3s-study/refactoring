package refactoring.sk.ch07._07_introduce_foreign_method;

import java.time.LocalDate;

public class Example1 {
    /*
     * 사용 중인 서버 클래스에 메소드를 추가해야 되는데, 서버 클래스를 수정 할 수 없을때
     * */

    private LocalDate today = LocalDate.now();

    LocalDate newStart = LocalDate.of(today.getYear(), today.getMonthValue(), today.getDayOfMonth() + 1);

    public LocalDate nextDay(LocalDate previousEnd) {
        return LocalDate.of(previousEnd.getYear(), previousEnd.getMonthValue(), previousEnd.getDayOfMonth() + 1);
    }

}
