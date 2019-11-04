package refactoring.sb.ch10._10_remove_setting_method.practice;

public class InterestAccount extends Account {
    private double interestRate;

    InterestAccount(String id, double rate) {
        super(id);
        interestRate = rate;
    }
}
