package refactoring.sb.ch10._14_replace_error_code_with_exception.practice;

public class Practice2 {
    public void practice2() {
        Account account = new Account();
        try{
            int amount = 0;
            account.newWithdraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            handleOverdrawn();
        }
    }

    private void handleOverdrawn() {
    }

    private void doTheUsualThing() {
    }
}
