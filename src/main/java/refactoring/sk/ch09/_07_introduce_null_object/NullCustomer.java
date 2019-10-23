package refactoring.sk.ch09._07_introduce_null_object;

public class NullCustomer extends Customer {
    public boolean isNull() {
        return true;
    }

    public String getName() {
        return "occupant";
    }
}
