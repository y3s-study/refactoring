package refactoring.yj.ch07._08_introduce_local_extension.example2;

import java.time.LocalDate;

/**
 * Introduce Local Extension (국소적 상속확장 클래스 사용)
 * <p>
 * 사용중인 서버 클래스에 여러개의 메서드를 추가해야 하는데 클래스를 수정할 수 없을 땐
 * <p>
 * - 새 클래스를 작성하고 그 안에 필요한 여러개의 매서드를 작성하자.
 * - 이 상속확장 클래스를 원본 클래스의 하위 클래스나 래퍼 클래스로 만들자.
 *
 * 예제2 : 래퍼 클래스로 정의
 */
public class DateWrapper {
    private LocalDate original;
}
