package refactoring.sb.ch10._14_replace_error_code_with_exception.practice;


public class Practice1 {
    
    private Account account;
    
    private void practice1() {
        int amount = 0;
        if(account.canWithdraw(amount)) {
            handleOverdrawn();
        } else {
            account.withdraw(amount);
            doTheUsualThing();
        }
    }

    private void doTheUsualThing() {

    }

    private void handleOverdrawn() {
    }
}
