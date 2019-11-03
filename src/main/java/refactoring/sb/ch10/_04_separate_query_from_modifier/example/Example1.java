package refactoring.sb.ch10._04_separate_query_from_modifier.example;

public class Example1 {
    String foundMiscreant(String[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if(people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {

    }

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private void someLaterCode(String found) {

    }
}
