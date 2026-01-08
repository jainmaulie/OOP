import java.util.Scanner;
class Practical4
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your weight in pound:");
    double W = sc.nextDouble();
    System.out.println("enter your height in inches:");
    double H = sc.nextDouble();
    
    double Weight = W*0.45359237;
    double Height = H*0.0254;
    double bmi = Weight/(Height*Height);

    System.out.println("your BMI is:" + bmi);  
  }

}