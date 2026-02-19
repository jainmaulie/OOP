import java.util.Scanner;

class College{

String collegeName;

College(String name){
collegeName = name;
}
class Admission{

String studentName;
String course;

void acceptDetail(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the name of the student:");
studentName = sc.nextLine();

System.out.println("enter the course:");
course = sc.nextLine();
}

void display(){
System.out.println("------Student Detail----");
System.out.println("College Name:" +collegeName);

System.out.println("Student Name:" + studentName);

System.out.println("Course:" + course);
 }
}

public static void main(String args[]){

System.out.println("Maulie Jain. 240390107024");

College c = new College("S.P.B patel Engineering college");
College.Admission a = c.new Admission();

a.acceptDetail();
a.display();
 }
}






