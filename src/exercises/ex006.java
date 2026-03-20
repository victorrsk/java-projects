package exercises;

import java.util.Scanner;

public class ex006 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code1, code2, qnt1, qnt2;
        double price1, price2;

        code1 = sc.nextInt();
        qnt1 = sc.nextInt();
        price1 = sc.nextDouble();
        code2 = sc.nextInt();
        qnt2 = sc.nextInt();
        price2 = sc.nextDouble();

        double sum = (qnt1 * price1) + (qnt2 * price2);

        System.out.printf("Total value: %.2f", sum);

    }
}
