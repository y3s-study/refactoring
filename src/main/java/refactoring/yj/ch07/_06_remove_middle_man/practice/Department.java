package refactoring.yj.ch07._06_remove_middle_man.practice;

public class Department {
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
