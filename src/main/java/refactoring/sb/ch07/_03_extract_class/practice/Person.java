package refactoring.sb.ch07._03_extract_class.practice;

public class Person {
    private TelephoneNumber officeTelephone = new TelephoneNumber();
    private String name;

    public String getName() {
        return name;
    }

}
