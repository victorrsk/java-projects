package comparables;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Integer[] intArr = {5, 4, 3, 2, 1};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));*/

        // COMPARABLE
        /*ComparableClass[] employeesComparable = new ComparableClass[4];
        employeesComparable[0] = new ComparableClass(10, "Mikey", 25, 10000);
        employeesComparable[1] = new ComparableClass(20, "Arun", 29, 20000);
        employeesComparable[2] = new ComparableClass(5, "Lisa", 35, 5000);
        employeesComparable[3] = new ComparableClass(1, "Pankaj", 32, 50000);

        ComparableClass testObj = new ComparableClass(10, "Victor", 18, 20000);
        int result = testObj.compareTo(new ComparableClass(1, "Victor", 98, 1000));
        System.out.println(result);

        Arrays.sort(employeesComparable);
        for ( ComparableClass comp : employeesComparable) {
            System.out.println(comp);

        }*/

        // COMPARATOR
        EmployeeClass[] employeesArr = new EmployeeClass[4];
        employeesArr[0] = new EmployeeClass(10, "Mikey", 25, 10000);
        employeesArr[1] = new EmployeeClass(20, "Arun", 29, 20000);
        employeesArr[2] = new EmployeeClass(5, "Lisa", 35, 5000);
        employeesArr[3] = new EmployeeClass(1, "Pankaj", 32, 50000);

        Arrays.sort(employeesArr, new MyComparator());
        for (EmployeeClass emp : employeesArr) {
            System.out.println(emp);
        }





    }
}
