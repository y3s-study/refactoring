package refactoring.yj.ch08._06_duplicate_observed_data.practice;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Duplicate Observed Data (관측 데이터 복제)
 * <p>
 * 도메인 데이터는 GUI 컨트롤 안에서만 사용 가능한데, 도메인 메서드가 그 데이터에 접근해야 할 땐
 * - 그 데이터를 도메인 객체로 복사하고, 양측의 데이터를 동기화하는 관측 인터페이스 observer를 작성하자.
 */
public class IntervalWindow extends Frame implements Observer {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;
    private Interval subject;

    public IntervalWindow() throws HeadlessException {
        this.subject = new Interval();
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
    }

    String getEnd() {
        return subject.getEnd();
    }

    void setEnd(String arg) {
        subject.setEnd(arg);
    }

    String getStart() {
        return subject.getStart();
    }

    void setStart(String arg) {
        subject.setStart(arg);
    }

    String getLength() {
        return subject.getLength();
    }

    void setLength(String arg) {
        subject.setLength(arg);
    }

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object eventSource = e.getSource();
            if (eventSource == startField) {
                StartField_FocusLost(e);
            } else if (eventSource == endField) {
                EndField_FocusLost(e);
            } else if (eventSource == lengthField) {
                LengthField_FocusLost(e);
            }
        }
    }

    private void LengthField_FocusLost(FocusEvent e) {
        setLength(lengthField.getText());
        if (isNotInteger(getLength())) {
            setLength("0");
        }
    }

    private void EndField_FocusLost(FocusEvent e) {
        setEnd(endField.getText());
        if (isNotInteger(getEnd())) {
            setEnd("0");
        }
    }

    private void StartField_FocusLost(FocusEvent e) {
        setStart(startField.getText());
        if (isNotInteger(getStart())) {
           setStart("0");
        }
    }

    private boolean isNotInteger(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}
