package refactoring.sk.ch11._10_replace_inheritance_with_delegation;

import java.util.Vector;

public class Example1 {
    class MyStack extends Vector {
        public void push(Object element) {
            insertElementAt(element, 0);
        }
        public Object pop() {
            Object result = firstElement();
            removeElementAt(0);
            return result;
        }
    }
}
