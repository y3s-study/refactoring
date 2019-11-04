package refactoring.sb.ch10._10_remove_setting_method.example;

public class Account {
    private String id;
    Account(String id) {
        setId(id);
    }

    void setId(String arg) {
        this.id = arg;
    }

    Account(){}
}
