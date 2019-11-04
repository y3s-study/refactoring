package refactoring.sb.ch10._14_replace_error_code_with_exception.example;

public class Account {

    private int balance;

    int withdraw(int amount) {
        if(amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}
