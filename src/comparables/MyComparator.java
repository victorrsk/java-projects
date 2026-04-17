package comparables;

import java.util.Comparator;

public class MyComparator implements Comparator<EmployeeClass> {
    @Override
    public int compare(EmployeeClass o1, EmployeeClass o2) {
        return o1.age.compareTo(o2.age);
    }
}
