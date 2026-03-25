package datastructures;

public class Arrays {
    static void main(String[] args) {
        /*int sum = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; ++i) {
            sum += arr[i];
        }
        System.out.println(sum);*/
        int[][] matrix = {
                {1, 2, 3}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9}  // 2
        };
        System.out.println(matrix[2][2]);
        int sum = 0;
        for (int[] array : matrix) {
            for (int number : array) {
                sum += number;
            }
        }
        System.out.println("The sum is: " + sum);

        sum = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
