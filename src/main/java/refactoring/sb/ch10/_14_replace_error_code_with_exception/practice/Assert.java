package refactoring.sb.ch10._14_replace_error_code_with_exception.practice;

public class Assert {
    static void isTrue(String comment, boolean test) {
        if(!test) {
            throw new RuntimeException("어설션 실패: " + comment);
        }
    }
}
