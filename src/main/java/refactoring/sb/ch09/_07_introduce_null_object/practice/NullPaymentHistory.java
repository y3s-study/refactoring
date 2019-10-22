package refactoring.sb.ch09._07_introduce_null_object.practice;

public class NullPaymentHistory extends PaymentHistory {
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
