package refactoring.sb.ch07._05_hide_delegate.example;

public class Department {
    private String chargeCode;
    private Person manager;

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }
}
