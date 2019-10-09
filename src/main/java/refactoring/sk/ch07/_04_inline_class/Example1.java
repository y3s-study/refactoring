package refactoring.sk.ch07._04_inline_class;

public class Example1 {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    public String getAreaCode() {
        return officeTelephone.getOfficeAreaCode();
    }

    public void setAreaCode(String areaCode) {
        officeTelephone.setOfficeAreaCode(areaCode);
    }

    public String getNumber() {
        return officeTelephone.getOfficeNumber();
    }

    public void setNumber(String number) {
        officeTelephone.setOfficeNumber(number);
    }

    static class TelephoneNumber {
        private String officeAreaCode;
        private String officeNumber;

        public String getTelephoneNumber() {
            return ("(" + getOfficeAreaCode() + ") " + getOfficeNumber());
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }

    }
}
