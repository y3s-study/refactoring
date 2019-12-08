package refactoring.sk.ch11._09_form_template_method.video_rental_shop;

import java.util.Enumeration;

abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration<Rental> rentals = aCustomer.getRentals().elements();
        String result = headerString(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // 모든 대여 비디오 정보와 대여료를 출력
            result += eachRentalString(each);
        }
        // 푸터 행 추가
        result += footerString(aCustomer);
        return result;
    }

    abstract String headerString(Customer aCustomer);

    abstract String eachRentalString(Rental aRental);

    abstract String footerString(Customer aCustomer);
}
