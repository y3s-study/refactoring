package refactoring.sb.ch10._10_remove_setting_method.example;

public class InterestAccount extends Account {
    private double interestRate;
    InterestAccount(String id, double rate) {
        setId(id);
        interestRate = rate;
    }
}
