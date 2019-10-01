package refactoring.yj.ch06._09_subtitute_algorithm.practice;

public class PersonFinder {
    public String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }

        return "";
    }
}
