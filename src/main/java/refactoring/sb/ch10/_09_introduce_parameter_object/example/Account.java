package refactoring.sb.ch10._09_introduce_parameter_object.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private List<Entry> entries = new ArrayList<>();

    double getFlowBetween(Date start, Date end) {
        double result = 0;
        for(Entry entry : entries) {
            if(entry.getDate().equals(start) ||
                    entry.getDate().equals(end) ||
                    (entry.getDate().after(start) &&
                            entry.getDate().before(end))) {
                result += entry.getValue();
            }
        }
        return result;
    }
}
