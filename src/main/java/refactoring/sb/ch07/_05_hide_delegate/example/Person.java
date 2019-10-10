package refactoring.sb.ch07._05_hide_delegate.example;

public class Person {
    private Department department;


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
