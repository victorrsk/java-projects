package exercises;

import java.util.Locale;

public class ex001 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // trying print methods
        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f", product1,
                price1, product2, price2);
        System.out.println("\n");
        System.out.println("Record: " + age + " years old, code" + code + " and gender: " + gender);
        System.out.println("\n");
        Locale.setDefault(Locale.US);
        System.out.printf("""
                Measure with eight decimal places: %.8f
                Rounded (three decimal places): %.3f
                US decimal point: %.3f""", measure, measure, measure);

    }
}
