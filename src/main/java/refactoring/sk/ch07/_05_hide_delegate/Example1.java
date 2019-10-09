package refactoring.sk.ch07._05_hide_delegate;

public class Example1 {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Example1 getManager() {
//        manager = john.getDepartment().getManager();
        return department.getManager();
    }

    static class Department {
        private String chargeCode;
        private Example1 manager;

        public Department(Example1 manager) {
            this.manager = manager;
        }

        public Example1 getManager() {
            return this.manager;
        }
    }
}

