package refactoring.yj.ch06._01_method_extract.practice;

public class Example1 {
    private String name;

    void printOwing(double amount) {
        printBanner();

        // 세부 정보 출력
        System.out.println("name:" + name);
        System.out.println("amount:" + amount);
    }

    private void printBanner() {
        System.out.println("=== Banner ===");
    }
}
