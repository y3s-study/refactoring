package refactoring.sb.ch10._05_parameterize_method.practice;

public class Employee {
    private double salary;

    void raise(double factor) {
        salary *= (1 + factor);
    }

}
