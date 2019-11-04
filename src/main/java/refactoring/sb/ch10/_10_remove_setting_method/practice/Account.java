package refactoring.sb.ch10._10_remove_setting_method.practice;

public class Account {
    private String id;

    Account(String id) {
        initializeId(id);
    }

    void initializeId(String arg) {
        id = "ZZ" + arg;
    }
}
