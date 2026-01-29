class Rectangle {

    double width = 1;
    double height = 1;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle sc = new Rectangle(5, 10);

        System.out.println("Area: " + sc.getArea());
        System.out.println("Perimeter: " + sc.getPerimeter());
    }
}
