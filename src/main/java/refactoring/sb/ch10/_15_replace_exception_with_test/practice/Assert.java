package refactoring.sb.ch10._15_replace_exception_with_test.practice;

public class Assert {
    static void shouldNeverReachHere(String message) {
        throw new RuntimeException(message);
    }
}
