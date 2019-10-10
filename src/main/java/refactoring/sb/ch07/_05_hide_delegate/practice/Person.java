package refactoring.sb.ch07._05_hide_delegate.practice;

public class Person {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }
}
