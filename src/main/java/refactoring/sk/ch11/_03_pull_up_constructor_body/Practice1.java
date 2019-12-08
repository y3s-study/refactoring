package refactoring.sk.ch11._03_pull_up_constructor_body;

public class Practice1 {
    static class Employee {
        String name;
        String id;

        Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }

        boolean isPriviliged() {
            return false;
        }

        void assignCar() {
            System.out.println("assignCar!!");
        }

        void initialize() {
            if (isPriviliged()) assignCar();
        }
    }

    static class Manager extends Employee {
        private int grade;

        public Manager(String name, String id, int grade) {
            super(name, id);
            this.grade = grade;
            initialize();
        }

        boolean isPriviliged() {
            return grade > 4;
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager("john", "ted", 5);
    }
}
