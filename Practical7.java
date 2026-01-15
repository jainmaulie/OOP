import java.util.Scanner;

class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of triangle:");
        double a = sc.nextDouble();

        System.out.println("Enter the second side of triangle:");
        double b = sc.nextDouble();

        System.out.println("Enter the third side of triangle:");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Triangle can be formed");

            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("The area of the triangle is " + area);
        } else {
            System.out.println("Triangle cannot be formed");
        }

        sc.close();
    }
}
