import java.util.Scanner;

class BankingApplication {
    private double balance;

    public BankingApplication(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit() {
        double amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount to be deposit");
        amount=sc.nextDouble();
        double temp = balance;
        temp = temp + amount;
        try {
            System.out.println("after deposit balance = $" + temp);
            balance = temp;
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }

        notify();
    }
    public synchronized void withdraw() {
        double amount = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount to be withdrawal");
        amount=sc.nextDouble();
        while (balance < amount) {
            try {
                wait(); // wait for funds
            } catch (InterruptedException ie) {
                System.err.println(ie.getMessage());
            }
        }
        double temp = balance;
        temp = temp - amount;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
        System.out.println("after withdrawl balance = $" + temp);
        balance = temp;
    }

    public synchronized void OpenAccount() {
        Scanner e=new Scanner(System.in);
        System.out.println("enter name");
        String st=e.next();
        System.out.println("enter account number");
        long l=e.nextLong();
        System.out.println("enter balance");
        balance=e.nextLong();

    }
}
class BankTransaction {
    public static void main(String[] args) {
        int choice;
        BankingApplication bankingApplication = new BankingApplication(21);
        Scanner s = new Scanner(System.in);
        do{
        System.out.println("enter 1. open account 2. deposit 3. withdrawal 4. close");

        System.out.println("enter choice");
        choice = s.nextInt();

            switch (choice) {
                case 1:
                    bankingApplication.OpenAccount();
                    break;
                case 2:
                    bankingApplication.deposit();
                    break;
                case 3:
                    bankingApplication.withdraw();
                    break;
                case 4:
                    break;
                default :System.out.println();
            }
        }
        while (choice != 4);
    }
}