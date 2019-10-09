package refactoring.yj.ch07._06_remove_middle_man.practice;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        Person manager = person.getDepartment().getManager();
    }
}
