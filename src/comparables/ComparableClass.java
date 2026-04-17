package comparables;

public class ComparableClass implements Comparable<ComparableClass>{
    private int id;
    private String name;
    private Integer age;
    private long salary;

    public ComparableClass(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableClass o) {
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "ComparableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
