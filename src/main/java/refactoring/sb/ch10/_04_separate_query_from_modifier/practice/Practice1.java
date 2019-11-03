package refactoring.sb.ch10._04_separate_query_from_modifier.practice;

public class Practice1 {
    String foundPerson(String[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].equals("Don")) {
                return "Don";
            }
            if(people[i].equals("John")) {
                return "John";
            }
        }
        return "";
    }

    void sendAlert(String[] people) {
        if(!foundPerson(people).equals("")) {
            sendAlert();
        }
    }

    private void sendAlert() {

    }

    void checkSecurity(String[] people) {
        sendAlert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void someLaterCode(String found) {

    }

}
