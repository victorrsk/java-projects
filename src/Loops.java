import com.sun.jdi.Value;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        // while
        /*var sc = new Scanner(System.in);
        int value = sc.nextInt();

        while (value != 0) {
            value = sc.nextInt();
            System.out.println(value);

        }*/
        // for
        var sc = new Scanner(System.in);
        int end = sc.nextInt();
        int i = 0;
        for (int cont=0; cont < end; cont++) {
            System.out.println(cont);
        }
    }
}
