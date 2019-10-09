package refactoring.sk.ch07._03_extract_class;

public class Example2 {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
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
