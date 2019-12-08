package refactoring.sk.ch11._11_replace_delegation_with_inheritance;

public class Example1 {
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

    class Employee {
        Person person = new Person();

        public String getName() {
            return person.getName();
        }

        public void setName(String name) {
            person.setName(name);
        }

        public String toString() {
            return "사원: " + person.getLastName();
        }

    }
}
