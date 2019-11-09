package refactoring.sk.ch10._10_remove_setting_method;

public class Example1 {

    class Account {
        private String id;

        Account(String id) {
            this.id = id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}

