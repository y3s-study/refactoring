package refactoring.sb.ch09._02_consolidate_conditional_expression.practice;

public class Example2 {

//    public double example2() {
//        if(onVacation() && lengthOfService() > 10) return 1;
//        else return 0.5;
//    }

    public double example2() {
        return (onVacation() && lengthOfService() > 10) ? 1 : 0.5;
    }

    private boolean onVacation() {
        return true;
    }

    private int lengthOfService() {
        return 0;
    }


}
