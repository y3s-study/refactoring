package refactoring.sb.ch10._15_replace_exception_with_test.example;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResourcePool {
    Stack available;
    Stack allocated;

    Resource getResource() {
        Resource result;
        try {
            result = (Resource) available.pop();
            allocated.push(result);
            return result;
        } catch (EmptyStackException e) {
            result = new Resource();
            allocated.push(result);
            return result;
        }
    }
}
