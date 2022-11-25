import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        double tot;
        int dRental = 250;
        int iRental = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the type of connection");
        String x = sc.next();
        System.out.println("enter the no.of units used:");
        int y = sc.nextInt();
        String d = "domestic";
        String i = "industrial";
        if (x.equals(d)) {
            if (y > 200) {
                tot = dRental + (y * 5);
                System.out.println(tot);
            } else {
                tot = (dRental + ((y * 5) / 2));
                System.out.println(tot);

            }
        }

        else{
                if (y > 1000) {
                    tot = iRental + (y * 8);
                    System.out.println(tot);
                } else if (y < 1000) {

                    tot = (iRental + (y * 8 )*0.1);
                    System.out.println(tot);
                }

            }

        }

    }

