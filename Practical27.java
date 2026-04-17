import java.util.Scanner;

interface Classify
{
  String getDivision(double average);
}
class Result implements Classify
{
  public String getDivision(double average)
  {
    if(average >= 60)
    {
       return "First Division";
    }
    else{
    return "no first division"; 
    }
  }
}
class Main
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Maulie Jain. 240390107024");
  Result r = new Result();
  System.out.println("enter the average value:");
  double avg = sc.nextDouble();
  System.out.println("average =" +avg);
  System.out.println("Division:" + r.getDivision(avg));
  }
}
  

 