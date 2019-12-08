package refactoring.sk.ch11._09_form_template_method.video_rental_shop;

public class HtmlStatement extends Statement {
    public String headerString(Customer aCustomer) {
        return "<H1><EM>" + aCustomer.getName() + " 고객님의 대여 기록</EM></h1><P>\n";
    }

    public String footerString(Customer aCustomer) {
        return "<P>누적 대여료: <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "적립 포인트: <EM>"
                + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM><P>";
    }

    public String eachRentalString(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }
}
