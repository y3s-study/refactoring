package refactoring.yj.ch06._09_subtitute_algorithm.practice;

import java.util.Arrays;
import java.util.List;

public class PersonFinder {
    public String foundPerson(String[] people) {
        List<String> candidates = Arrays.asList("Don", "John", "Kent");

        for (String person : people) {
            if (candidates.contains(person)) {
                return person;
            }
        }

        return "";
    }
}
