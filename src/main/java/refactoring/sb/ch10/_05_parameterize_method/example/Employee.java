package refactoring.sb.ch10._05_parameterize_method.example;

public class Employee {
    private double salary;

    void tenPercentRaise() {
        salary *= 1.1;
    }

    void fivePercentRaise() {
        salary *= 1.05;
    }
}
