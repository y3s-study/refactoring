package refactoring.sb.ch10._14_replace_error_code_with_exception.example;


public class Practice1 {
    
    private Account account;
    
    private void practice1() {
        int amount = 0;
        if(account.withdraw(amount) == -1) {
            handleOverdrawn();
        } else {
            doTheUsualThing();
        }
    }

    private void doTheUsualThing() {
        
    }

    private void handleOverdrawn() {
    }
}
