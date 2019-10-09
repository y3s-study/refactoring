package refactoring.sk.ch07._08_introduce_local_extension;

import java.util.Date;

public class Example1 extends Date {
    /*
    * 하위 클래스 사용방식
    * */
    public Example1(String dateString) {
        super(dateString);
    }

    public Example1(Date date) {
        super(date.getTime());
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }

    /*
    * 래퍼 클래스 생성
    * public MfDateWrap (String dateString) {
    *   original = new Date(dateString);
    * }
    *
    * 원래 클래스의 기능을 다 구현하고... 원하는 기능을 추가한다..
    * 예제는 생략한다..
    * */
}
