public class employee {
    public static void main(String[] args) {
        String empName;
        int empId;
        hello h = new hello(102, 345);
        emp e=new emp(231,"reddy","associate engineer");
    }
}
class hello
{
    int id;
    int sal;
    hello(int id,int sal)
    {
        this.id=id;
        this.sal=sal;
        System.out.println("emp id:"+id);
        System.out.println("emp sal:"+sal);
    }

}
class emp
{
    int id;
    String empName;
    String des;
    emp(int id,String empName,String des)
    {
        this.id=id;
        this.empName=empName;
        this.des=des;
        System.out.println("emp id is:"+id +"emp name is:"+empName +"emp des is:"+des);
    }
}

