package refactoring.sb.ch09._04_remove_control_flag.practice;

public class Example2 {

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private String foundMiscreant(String[] people) {
        String found = "";
        for(int i = 0; i < people.length; i++) {
            if(found.equals("")) {
                if(people[i].equals("Don")) {
                    sendAlert();
                    return "Don";
                }
            }
            if(people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {
    }


    private void sendAlert() {
    }
}
