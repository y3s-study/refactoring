package refactoring.yj.ch01.example.video_rental_shop;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //대여하는 비디오 정보와 대여로를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        // footer 추가
        result += "누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n";
        result += "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
        return result;
    }

    public String htmlStatement() {
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "<H1><EM>" + getName() + " 고객님의 대여 기록</EM></h1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            // 모든 대여 비디오 정보와 대여료를 출력
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }

        // 푸터 행 추가
        result += "<P>누적 대여료: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "적립 포인트: <EM>" + String.valueOf(getTotalFrequentRenterPoints()) +  "</EM><P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
