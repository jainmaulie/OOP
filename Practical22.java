import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

class AreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1, d2;  

        System.out.print("Enter value of d1: ");
        d1 = sc.nextDouble();
        System.out.print("Enter value of d2: ");
        d2 = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(d1, d2);
        System.out.println("Triangle Area: " + t.calculateArea()); 

        Rectangle r = new Rectangle();
        r.getData(d1, d2);
        System.out.println("Rectangle Area: " + r.calculateArea()); 

        sc.close();
    }
}







 