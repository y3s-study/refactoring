package refactoring.sb.ch09._07_introduce_null_object.practice;

public class PaymentHistory {
    public static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }

    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
