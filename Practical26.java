import java.util.Scanner;
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

class Practical26{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Maulie Jain.240390107024");

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        p.processPayment(amount);

        sc.close();
    }
}