package refactoring.sb.ch10._15_replace_exception_with_test.practice;

import java.util.EmptyStackException;
import java.util.Stack;

public class ResourcePool {
    Stack available;
    Stack allocated;

    Resource getResource() {
        Resource result;
        if(available.isEmpty()) {
            result = new Resource();
        } else {
            result = (Resource) available.pop();
        }
        allocated.push(result);
        return result;
    }
}
