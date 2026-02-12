class Rectangle {
    double width;
    double height;

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

class Practical13 {

    public static void main(String args[]) {

        System.out.println("Maulie jain 240390107024");

        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 40;

        Rectangle r2 = new Rectangle();
        r2.width = 3.5;
        r2.height = 35.9;

        System.out.println("Rectangle 1:");
        System.out.println("width = " + r1.width);
        System.out.println("height = " + r1.height);
        System.out.println("area = " + r1.getArea());
        System.out.println("perimeter = " + r1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("width = " + r2.width);
        System.out.println("height = " + r2.height);
        System.out.println("area = " + r2.getArea());
        System.out.println("perimeter = " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Area of Rectangle 1 is greater");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Area of Rectangle 2 is greater");
        } else {
            System.out.println("Area of Rectangle 1 and Rectangle 2 is same");
        }
    }
}
