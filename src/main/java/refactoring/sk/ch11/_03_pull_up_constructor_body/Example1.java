package refactoring.sk.ch11._03_pull_up_constructor_body;

public class Example1 {
    class Employee {
        String name;
        String id;
        int grade;
    }

    class Manager extends Employee {
        public Manager(String name, String id, int grade) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }
    }

}
