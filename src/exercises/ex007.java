package exercises;

import java.util.Scanner;

public class ex007 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Positive number.");
        }
        else {
            System.out.println("Negative number.");
        }
    }
}
