package poo;


public class Main {
    static void main(String[] args) {
        var a = new SumClass();
        a.num1 = 10.0;
        a.num2 = 20.0;
        a.num3 = 20.0;
        System.out.println(a.sumNums());
        var staticVar = new StaticClass();
        var static2 = new StaticClass();
        staticVar.age = 10;
        System.out.println(staticVar.age);
        System.out.println(static2.age);
    }
}
