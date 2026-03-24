package poo;

public class InitializerBlock {
    static String message;

    {
        message = "This is the instance initializer block!";
        System.out.println(message);
    }

    static {
        message = "This is the static initializer block!";
        System.out.println(message);
    }

    static void main(String[] args) {
        var obj1 = new InitializerBlock();
        var obj2 = new InitializerBlock();
        var obj3 = new InitializerBlock();

    }
}
