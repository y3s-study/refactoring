package refactoring.sb.ch09._04_remove_control_flag.example;

public class Example1 {

    void checkSecurity(String[] people) {
        boolean found = false;
        for(int i = 0; i < people.length; i++) {
            if(!found) {
                if(people[i].equals("Don")) {
                    sendAlert();
                    found = true;
                }
            }
            if(people[i].equals("John")) {
                sendAlert();
                found = true;
            }
        }
    }

    private void sendAlert() {
    }
}
