package refactoring.sk.ch11._10_replace_inheritance_with_delegation;

import java.util.Vector;

public class Practice1 {
    class MyStack {
        private Vector vector = new Vector();

        public void push(Object element) {
            vector.insertElementAt(element, 0);
        }

        public Object pop() {
            Object result = vector.firstElement();
            vector.removeElementAt(0);
            return result;
        }

        public int size() {
            return vector.size();
        }

        public boolean isEmpty() {
            return vector.isEmpty();
        }
    }
}
