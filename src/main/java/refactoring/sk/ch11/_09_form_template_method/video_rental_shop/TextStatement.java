package refactoring.sk.ch11._09_form_template_method.video_rental_shop;

public class TextStatement extends Statement {
    public String headerString(Customer aCustomer) {
        return aCustomer.getName() + " 고객님의 대여 기록 \n";
    }

    public String eachRentalString(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String footerString(Customer aCustomer) {
        return "누적 대여료 : " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
                "적립 포인트 : " + String.valueOf(aCustomer.getTotalFrequentRenterPoints());
    }
}
