package refactoring.sk.ch10._10_remove_setting_method;

public class Practice1 {
//    생성자나 이름이 확실한 메서드를 사용하자.

    class Account {
        private final String id;

        Account(String id) {
            this.id = id;
        }

//        public void setId(String id) {
//            this.id = id;
//        }
    }
}
