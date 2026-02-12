class Point{
int x;
int y;

Point(){
x = 5;
y = 5;
}

Point(int a , int b){
x = a;
y = b;
}

Point(Point p){
x = p.x;
y = p.y;
}

void display(){
System.out.println("Point coordinates:("+ x +" ," + y +")");
}
}

public class Practical12{

public static void main(String args[]){
System.out.println("Maulie Jain. 240390107024");
Point p1 = new Point();
p1.display();

Point p2 = new Point(10 , 20);
System.out.println("Parameterized constructor:");
p2.display();

Point p3 = new Point(p2);
System.out.println("copy constructor:");
p3.display();
}
}


