package refactoring.sb.ch09._02_consolidate_conditional_expression.example;

public class Example2 {

    public double example2() {
        if(onVacation()) {
            if(lengthOfService() > 10) {
                return 1;
            }
        }
        return 0.5;
    }

    private boolean onVacation() {
        return true;
    }

    private int lengthOfService() {
        return 0;
    }
}
