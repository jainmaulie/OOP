import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int id);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String item;
    int qty;
    int orderId;
    static int count = 1;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = count++;   // auto increment ID

        System.out.println("Order placed successfully");
        System.out.println("Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    public void cancelOrder(int id) {
        if (orderId == id) {
            System.out.println("Order cancelled");
            item = "";
            qty = 0;
        } else {
            System.out.println("Invalid Order ID");
        }
    }

    public void generateBill() {
        if (qty == 0) {
            System.out.println("No order available");
            return;
        }

        int price = 100;
        int total = price * qty;

        System.out.println("\n--- BILL ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total: " + total);
    }
}

class Practical29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder o = new FinalOrder();
        System.out.println("Maulie Jain.240390107024");

        System.out.print("Enter item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        o.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        int choice = sc.nextInt();

        if (choice == 1) {
            o.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            o.cancelOrder(id);
        } else {
            System.out.println("Wrong choice");
        }

        sc.close();
    }
}