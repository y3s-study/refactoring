package refactoring.sk.ch11._11_replace_delegation_with_inheritance;

public class Practice1 {
    class Person {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return name.substring(name.lastIndexOf(' ') + 1);
        }
    }

    class Employee extends Person {
        public String toString() {
            return "사원: " + getLastName();
        }

    }
}
