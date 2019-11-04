package refactoring.sb.ch10._12_replace_constructor_with_factory_method.practice;

public class Person {
    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }
}
