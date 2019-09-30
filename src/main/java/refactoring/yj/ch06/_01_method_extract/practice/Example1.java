package refactoring.yj.ch06._01_method_extract.practice;

public class Example1 {
    private String name;

    void printOwing(double amount) {
        printBanner();
        printDetail(amount);
    }

    private void printBanner() {
        System.out.println("=== Banner ===");
    }

    private void printDetail(double amount) {
        System.out.println("name:" + name);
        System.out.println("amount:" + amount);
    }
}
