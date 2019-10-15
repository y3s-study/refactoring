package refactoring.yj.ch08._02_replace_data_value_with_object.practice;

public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
