package basics;

public class StringMethods {
    static void main(String[] args) {
        String text = "       Sample text for trying string methods!                ";
        System.out.println("Without spaces: " + text.trim());
        System.out.println("Character at pos 10: " + text.charAt(10));
        System.out.println("Concat: " + text.concat("other text"));
        System.out.println("Contains text: " + text.contains("text"));
        System.out.println("Equal?: " + text.equalsIgnoreCase("       sample text FOR TRYiNg sTring methods!                "));
        System.out.println(text.indexOf("Sample"));
        System.out.println("Length: " + text.length());
        System.out.println("Replace: " + text.replace("a", "x"));
        System.out.println();
        System.out.println(text);


    }
}
