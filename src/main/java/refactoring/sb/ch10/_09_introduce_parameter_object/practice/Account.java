package refactoring.sb.ch10._09_introduce_parameter_object.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private List<Entry> entries = new ArrayList<>();

    double getFlowBetween(DateRange range) {
        double result = 0;
        for(Entry entry : entries) {
            if(range.includes(entry.getDate())) {
                result += entry.getValue();
            }
        }
        return result;
    }
}
