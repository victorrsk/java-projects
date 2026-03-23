package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex011 {
    static void main(String[] args) {
        var product = new ClassForEx011();
        var sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        product.name = "rice";
        product.price = 10.0;
        product.quantity = 20;

        /*System.out.printf("Name: %s\nQuantity: %d\nPrice: $%.2f\nTotal value: %.2f\n", product.name, product.quantity, product.price, product.totalValueInStock());

        product.addProducts(10);

        System.out.printf("Name: %s\nQuantity: %d\nPrice: $%.2f\nTotal value: %.2f\n", product.name, product.quantity, product.price, product.totalValueInStock());

        product.removeProducts(5);

        System.out.printf("Name: %s\nQuantity: %d\nPrice: $%.2f\nTotal value: %.2f", product.name, product.quantity, product.price, product.totalValueInStock());*/
        System.out.println(product);

    }

}
