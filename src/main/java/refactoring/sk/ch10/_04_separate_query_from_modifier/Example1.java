package refactoring.sk.ch10._04_separate_query_from_modifier;

public class Example1 {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
        System.out.println("sendAlert!!!");
    }

    private void someLaterCode(String found) {
        System.out.println("some later code!! : " + found);
    }
}
