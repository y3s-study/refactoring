package refactoring.sk.ch10._04_separate_query_from_modifier;

public class Pratice1 {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        sendAlert(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return foundPerson(people);
            }
            if (people[i].equals("John")) {
                sendAlert();
                return foundPerson(people);
            }
        }
        return "";
    }

    private void sendAlert(String[] people) {
        if (!foundPerson(people).equals(""))
            sendAlert();
    }

    private void sendAlert() {
        System.out.println("send alert!!");
    }

    private void someLaterCode(String found) {
        System.out.println("some later code!! found : " + found);
    }

    private String foundPerson(String[] people) {
        return "";
    }
}
