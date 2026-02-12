import java.util.Scanner;

class BillGenerator {

  
    void generateBill(int itemTotal) {
        System.out.println("Customer type: Regular");
        System.out.println("Total Bill Amount: Rs. " + itemTotal);
    }

 
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer type: Privileged");
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Total Bill Amount: Rs. " + finalAmount);
    }

  
    void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Customer type: Festive Offer");
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Total Bill Amount: Rs. " + finalAmount);
    }
}

class Practical15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.println("Maulie Jain 240390107024");

        System.out.println("Enter total item amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                bill.generateBill(total);
                break;

            case 2:
                System.out.println("Enter flat discount amount: ");
                int discount = sc.nextInt();
                bill.generateBill(total, discount);
                break;

            case 3:
                System.out.println("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bill.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
