package exercises;

import java.util.Scanner;

public class ex004 {
    static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        double diff = (a * b) - (c * d);
        System.out.printf("Difference is: %.2f", diff);

    }
}
