import java.util.Scanner;

public class luckyNum {
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int i=1;
            int count=1;
            while(true) {
                System.out.println("enter a num");
                int i1=sc.nextInt();
                System.out.println(+i1);

                if (i1 == 5) {
                    System.out.println("Great! you have guessed in right num" +count);
                    break;
                } else {
                    System.out.println("Not Really! Please Try Again!!");
                    count++;


                }
            }
        }
    }

