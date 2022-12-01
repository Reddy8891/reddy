import java.util.*;

public class StudentClass implements Comparable<StudentClass> {


    int studId;
    String studName;
    int age;
    String collegeName;

    public StudentClass(int studId , String studName, int age, String collegeName) {
        this.studId=studId;
        this.studName=studName;
        this.collegeName=collegeName;
        this.age=age;
    }
    public int compareTo(StudentClass studentClass){
        if(age==studentClass.age){
            return 0;
        } else if (age>studentClass.age) {
            return 1;

        }
        else
            return -1;
    }

    public static void main(String[] args){
        int studId;
        String studName;
        int age;
        String collegeName = null;
        ArrayList<StudentClass> al=new ArrayList<StudentClass>();
        StudentClass s1=new StudentClass(11,"konda",21,"RLJIT");
        StudentClass s2=new StudentClass(12,"sai",23,"RLJIT");
        StudentClass s3=new StudentClass(13,"pavan",23,"RLJIT");
        StudentClass s4=new StudentClass(14,"pras",22,"RLJIT");
        StudentClass s5=new StudentClass(15,"meghana",21,"RLJIT");
        StudentClass s6=new StudentClass(16,"supraja",21,"RLJIT");
        StudentClass s7=new StudentClass(17,"reddy",21,"SAi");

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        al.add(s7);
        Collections.sort(al);
       for (StudentClass studentClass:al){
            System.out.println(studentClass.studId+"  "+studentClass.studName+""+studentClass.age+" "+studentClass.collegeName);
        }
        /*System.out.println("enter college name");
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(str);*/



        }
    }


//Create a Student class with fields studId, studName, age and collegeName.
// Create at least 6 student objects and then ask user to enter collegeName and
//then display all students belong to that college