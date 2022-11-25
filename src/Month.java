import java.util.Scanner;

public enum Month {
    JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5),JUNE(6),
    JULY(7),AUGUST(8),SEPTEMBER(9),OCTOBER(10),NOVEMBER(11),DECEMBER(12);

   int Month;

    Month(int month) {
        this.Month=month;
    }
}

class Month1 {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a month number");
        int x=s.nextInt();
        for(Month m :Month.values()){
            if(m.Month==x){
            System.out.println("the month " +x + " " + "is" +m);
            }
        }



    }

}
