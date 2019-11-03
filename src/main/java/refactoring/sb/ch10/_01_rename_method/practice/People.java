package refactoring.sb.ch10._01_rename_method.practice;

public class People {
    private String officeNumber;
    private String officeAreaCode;

    public String getTelephoneNumber() {
        return getOfficeTelephoneNumber();
    }

    public String getOfficeTelephoneNumber() {
       return ("(" + officeAreaCode + ")" + officeNumber);
    }
}
