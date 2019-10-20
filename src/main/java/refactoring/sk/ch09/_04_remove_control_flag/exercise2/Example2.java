package refactoring.sk.ch09._04_remove_control_flag.exercise2;

public class Example2 {
    public void checkSecurity(String[] people) {
        String found = findMiscreant(people);
        someLaterCode(found);
    }

    private String findMiscreant(String[] people) {
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
    }

    private void someLaterCode(String found) {
    }
}
