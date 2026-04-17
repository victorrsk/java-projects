package comparables;

import java.util.Comparator;

public class EmployeeClass {
    public int id;
    public String name;
    public Integer age;
    public long salary;

    public EmployeeClass(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
