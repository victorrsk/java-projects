package exercises;

import java.util.Scanner;

public class ex015 {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i=0; i< matrix.length; i++) {

            for (int j=0; j<matrix[i].length; j++) {

                if (matrix[i][j] == number) {
                    if (i > 0) {
                        System.out.println("Number above: " + matrix[i-1][j]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Number down: " + matrix[i+1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Number left: " + matrix[i][j-1]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Number right: " + matrix[i][j+1]);
                    }
                }
            }
        }
    }
}
