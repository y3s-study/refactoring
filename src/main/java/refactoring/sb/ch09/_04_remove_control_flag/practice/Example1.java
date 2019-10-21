package refactoring.sb.ch09._04_remove_control_flag.practice;

public class Example1 {
    void checkSecurity(String[] people) {
        boolean found = false;
        for(int i = 0; i < people.length; i++) {
            if(!found) {
                if(people[i].equals("Don")) {
                    sendAlert();
                    break;
                }
            }
            if(people[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
    }
}
