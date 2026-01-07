import java.util.Scanner;

class Practical1
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter distance in meter:");
      double meter = sc.nextDouble();

      double feet = meter * 3.28084;

      System.out.printf("Distance in feet : %.2f", feet);
   }
}
