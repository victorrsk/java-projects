package basics;

public class MethodCreation {
    static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println(result);
        int result2 = sum(10, 10, 20);
        System.out.println(result2);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
