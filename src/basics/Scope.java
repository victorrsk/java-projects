package basics;

public class Scope {
    static void main(String[] args) {
        // vars can only be used after its declaration
        // System.out.println(name);
        String name = "victor";
        System.out.println(name);
        // vars declared in a code block can only be used
        // inside the code block.
        {
            int num = 10;
            System.out.println(num);
        }
        // System.out.println(num);
        // vars declared inside a for loop can only be use inside the loop
        // this includes the default  "i" var, which is destroyed in the end
        for(int i=0; i<5; ++i) {
            System.out.println(i);
            int age = 18;
            System.out.println(age);
        }
        // System.out.println(age);
    }
}
