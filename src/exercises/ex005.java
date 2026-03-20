package exercises;

import java.util.Scanner;

public class ex005 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valuePerHour = sc.nextDouble();
        double salary = valuePerHour * hours;
        System.out.println("Number = " + number);
        System.out.printf("Salary = U$ %.2f", salary);
    }
}
