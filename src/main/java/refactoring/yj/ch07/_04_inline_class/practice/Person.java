package refactoring.yj.ch07._04_inline_class.practice;

/**
 * Inline Class (클래스 내용 직접 삽입)
 * <p>
 * 클래스의 기능이 너무 적을 땐
 * - 그 클래스의 모든 기능을 다른 클래스로 합쳐 넣고 원래의 클래스는 삭제하자.
 */
public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + _officeAreaCode + ") " + _officeNumber;
    }

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this._officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this._officeNumber = officeNumber;
    }
}
