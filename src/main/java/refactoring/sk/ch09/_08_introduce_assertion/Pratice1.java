package refactoring.sk.ch09._08_introduce_assertion;

import com.sun.tools.javac.util.Assert;

public class Pratice1 {
    private double expenseLimit = 1;
    private double NULL_EXPENSE = 1;

    private PrimaryProject primaryProject = new PrimaryProject();

    double getExpenseLimit() {
        Assert.check(expenseLimit != NULL_EXPENSE || primaryProject != null);
        return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemeberExpenseLimit();
    }

    class PrimaryProject {
        public double getMemeberExpenseLimit() {
            return 0;
        }
    }
}
