import java.util.Scanner;

public class WholeSaleAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value");
        int x = sc.nextInt();
        String c = "cooker";
        String k = "kettle";
        System.out.println("enter item ");
        String str = sc.next();
        if (str.equals(c)) {

            if (x > 50) {
                System.out.println("the price is 850 rupees per unit");

            } else if (x < 50 && x > 30) {
                System.out.println("the price is 900 rupees per unit");
            } else {
                System.out.println("the price is 950 rupees per unit");
            }
        } else {

            if (x > 50) {
                System.out.println("the price is 700 rupees per unit");

            } else if (x < 50 && x > 30) {
                System.out.println("the price is 800 rupees per unit");
            } else {
                System.out.println("the price is 900 rupees per unit");
            }

        }
    }

}
