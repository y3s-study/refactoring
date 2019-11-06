package refactoring.sk.ch10._06_replace_parameter_with_explicit_methods;


public class Example1 {
    private int height = 0;
    private int width = 0;

    private void setValue(String name, int value) {
        if (name.equals("height")) {
            height = value;
            return;
        }
        if (name.equals("width")) {
            width = value;
            return;
        }
    }

    private void setHeight(int arg) {
        height = arg;
    }

    private void setWidth(int arg) {
        width = arg;
    }
}
