package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex014 {
    static void main(String[] args) {
        int id;
        String name;
        double salary;
        int employeeQuantity;
        Scanner sc = new Scanner(System.in);

        List<ClassForEx014> employees = new ArrayList<>();

        System.out.println("How many employees?");
        employeeQuantity = sc.nextInt();

        for (int i=0; i<employeeQuantity; i++) {

            System.out.println("Enter the employee id: ");
            id = sc.nextInt();

            if (hasId(employees, id)) {
                System.out.println("Employee already exists.");
            } else {
                System.out.println("Employee name: ");
                name = sc.next();

                System.out.println("Employee salary: ");
                salary = sc.nextDouble();

                employees.add(new ClassForEx014(salary, name, id));
                System.out.println("Employee registered");
            }
        }

        System.out.println(employees.get(0));

        System.out.println("Do you want to increase an employee salary?: ");
        String increaseAnswer = sc.next();

        if (increaseAnswer.equals("y")) {
            System.out.println("Enter the employee id to increase the salary: ");
            int idToIncrease = sc.nextInt();

            if (hasId(employees, idToIncrease)) {
                for (ClassForEx014 employee : employees) {
                    if (employee.id == idToIncrease) {
                        System.out.println("Percentage to increase: ");
                        int percentage = sc.nextInt();
                        employee.salaryIncrease(percentage);
                    }
                }
            }
            else {
                System.out.println("This is doesn't exist...");
            }
        }
        System.out.println(employees.get(0));

    }
    public static boolean hasId(List<ClassForEx014> employees, int id) {
        for (ClassForEx014 employee : employees) {
            if (employee.id == id) {
                return true;
            }
        }
        return false;
    }
}
