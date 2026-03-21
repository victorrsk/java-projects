package exercises;

import java.util.Scanner;

public class ex008 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isEven = number % 2 == 0;
        if (isEven) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}