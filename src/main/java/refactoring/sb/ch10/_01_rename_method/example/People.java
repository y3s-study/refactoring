package refactoring.sb.ch10._01_rename_method.example;

public class People {
    private String officeNumber;
    private String officeAreaCode;

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ")" + officeNumber);
    }
}
