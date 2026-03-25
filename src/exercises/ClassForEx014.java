package exercises;

public class ClassForEx014 {
    public int id;
    public String name;
    private double salary;

    public ClassForEx014(double salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double value) {
        this.salary += value;
    }

    public void salaryIncrease(int percentage) {
        double increase = (this.getSalary() / 100) * percentage;
        this.setSalary(increase);
    }

    @Override
    public String toString() {
        return "ID: " + this.id
                + "\nName: " + this.name
                + "\nSalary: " + this.getSalary();
    }
}
