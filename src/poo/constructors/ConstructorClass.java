package poo.constructors;

public class ConstructorClass {
    int age;
    String name;
    private String cpf = "123.456.789-00";

    public ConstructorClass() {

    }
    public ConstructorClass(int age, String name, String cpf) {
        this.age = age;
        this.name = name;
        this.cpf = cpf;
    }

    private void getCpf() {
        System.out.println(this.cpf);
    }
    public void showCpf() {
        this.getCpf();
    }
}
