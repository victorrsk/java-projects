package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.printf("A = %.4f", area);

    }
}
