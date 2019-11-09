package refactoring.sk.ch10._12_replace_constructor_with_factory_method;

public class Example2 {
    // Person kent = new Male(); -> Person kent = Person.createMale();

    abstract static class Person {
        static Person createMale() {
            return new Male();
        }

        static Person createFemale() {
            return new Female();
        }
    }

    static class Male extends Person {
        Male() {
            System.out.println("male class is created!!");
        }
    }

    static class Female extends Person {

    }

//    public static void main(String[] args) {
//        Person kent = Person.createMale();
//    }
}
