package refactoring.sb.ch09._04_remove_control_flag.example;

public class Example2 {

    void checkSecurity(String[] people) {
        String found = "";
        for(int i = 0; i < people.length; i++) {
            if(found.equals("")) {
                if(people[i].equals("Don")) {
                    sendAlert();
                    found = "Don";
                }
            }
            if(people[i].equals("John")) {
                sendAlert();
                found = "John";
            }
        }
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }


    private void sendAlert() {
    }
}
