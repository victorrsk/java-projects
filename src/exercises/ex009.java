package exercises;

import java.util.Scanner;

public class ex009 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        boolean isMultiple = num1 % num2 == 0 || num2 % num1 == 0;
        if (isMultiple) {
            System.out.println("The numbers are multiples!");
        }
        else {
            System.out.println("The numbers aren't multiples...");
        }
    }
}
