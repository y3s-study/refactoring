package refactoring.sk.ch07._02_move_field;

/*
 * 필드 자제 캡슐화
 * 많은 메소드가 필드를 사용할 경우 메소드로 빼는것
 * */
public class Example3 {
    private Example1.AccountType type;
    private double interestRate;

    double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    private double getInterestRate() {
        return interestRate;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

//    private double getInterestRate() {
//        return type.getInterestRate();
//    }
//
//    private void setInterestRate(double arg) {
//        type.setInterestRage(arg);
//    }

    static class AccountType {
        private double interestRate;

        void setInterestRage(double interestRage) {
            interestRate = interestRage;
        }

        double getInterestRate() {
            return interestRate;
        }
    }
}
