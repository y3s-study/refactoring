package refactoring.sk.ch09._04_remove_control_flag.exercise1;

public class Example1 {

    public void checkSecurity(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                break;
            }
            if (people[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
    }

}
