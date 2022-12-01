import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    double sal;

    public int compareTo(Employee employee) {
        if (sal == employee.sal) {
            return 0;
        } else if (sal > employee.sal) {
            return 1;

        } else
            return -1;
    }

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public static void main(String[] args) {
        ArrayList<Employee> str = new ArrayList<>();
        Employee e1 = new Employee(101, "sai", 10000);
        Employee e2 = new Employee(102, "prashanti", 2000);
        Employee e3 = new Employee(103, "konda", 12345);
        Employee e4 = new Employee(104, "supraja", 200000);
        Employee e5 = new Employee(105, "shanti", 45000);
        str.add(e1);
        str.add(e2);
        str.add(e3);
        str.add(e4);
        str.add(e5);
        /*for(String s:str){
            if(s.startsWith("s"))
            {
                System.out.println(s);
            }
        }*/
        Collections.sort(str);
        for (Employee e : str) {
            System.out.println(e.id + "  " + e.sal);
        }
System.out.println();
    }
}