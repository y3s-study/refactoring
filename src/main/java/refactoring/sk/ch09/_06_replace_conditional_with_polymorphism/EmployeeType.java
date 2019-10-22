package refactoring.sk.ch09._06_replace_conditional_with_polymorphism;

abstract class EmployeeType {
//    abstract int getTypeCode();

    abstract int payAmount(Employee employee);

//    int payAmount(Employee employee) {
//        switch (getTypeCode()) {
//            case ENGINEER:
//                return employee.getMonthlySalary();
//            case SALESMAN:
//                return employee.getMonthlySalary() + employee.getCommission();
//            case MANAGER:
//                return employee.getMonthlySalary() + employee.getBonus();
//            default:
//                throw new RuntimeException("없는 사원 입니다.");
//        }
//
//    }
}
