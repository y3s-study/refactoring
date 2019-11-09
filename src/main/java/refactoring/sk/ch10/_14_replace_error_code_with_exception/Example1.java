package refactoring.sk.ch10._14_replace_error_code_with_exception;

public class Example1 {

    private int balance = 0;

    // 메서드가 에러를 나타내는 특수한 부호를 반환할 땐 그 부호 반환 코드를 예외 통지 코드로 바꾸자.
//    int withdraw(int amount) {
//        if (amount > balance) {
//            return -1;
//        } else {
//            balance -= amount;
//            return 0;
//        }
//    }


    void withdraw(int amount) throws BalanceException {
        if (amount > balance) throw new BalanceException();
        balance -= amount;
    }

    class BalanceException extends Exception {

    }

}
