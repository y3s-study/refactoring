package refactoring.yj.ch08._06_duplicate_observed_data.practice;

import java.util.Observable;

public class Interval extends Observable {
    private String end = "0";
    private String start = "0";
    private String length = "0";

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getLength() {
        return length;
    }

    public void setStart(String start) {
        this.start = start;
        calculateLength();
        setChangedAndNotifyObservers();
    }

    public void setEnd(String end) {
        this.end = end;
        calculateLength();
        setChangedAndNotifyObservers();
    }

    public void setLength(String length) {
        this.length = length;
        calculateEnd();
        setChangedAndNotifyObservers();
    }

    private void setChangedAndNotifyObservers() {
        setChanged();
        notifyObservers();
    }

    private void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = start - end;
            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }
    }

    private void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(getLength());
            int end = start + length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }

    }
}
