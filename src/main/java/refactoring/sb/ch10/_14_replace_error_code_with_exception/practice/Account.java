package refactoring.sb.ch10._14_replace_error_code_with_exception.practice;

public class Account {

    private int balance;

    int withdraw(int amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("액수가 너무 큽니다");
        } else {
            balance -= amount;
            return 0;
        }
    }

//    void withdraw(int amount) {
//        Assert.isTrue("잔액이 충분합니다", amount <= balance);
//        balance -= amount;
//    }

    void newWithdraw(int amount) throws BalanceException {
        if(amount > balance) {
            throw new BalanceException();
        }
        balance -= amount;
    }

    boolean canWithdraw(int amount) {
        return false;
    }
}
