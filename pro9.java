import java.util.Scanner; //pro9

abstract class Shape {
    abstract public double area();

    abstract public double perimeter();
}

class circleDemo extends Shape {

    double pi = 3.14, r;

    circleDemo(double r) {
        this.r = r;
    }

    public double area() {
        return pi * this.r * this.r;
    }

    public double perimeter() {
        return 2 * pi * this.r;
    }

}

class RectangleDemo extends Shape {

    double l, b;

    RectangleDemo(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return this.l * this.b;
    }

    public double perimeter() {
        return 2 * (this.l + this.b);
    }

}

class TriangleDemo extends Shape {

    double h, b, a, b1, c;

    TriangleDemo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    TriangleDemo(double a, double b1, double c) {
        this.a = a;
        this.b1 = b1;
        this.c = c;
    }

    public double area() {
        return (b * h) / 2;

    }

    public double perimeter() {
        return a + b1 + c;
    }

}

public class pro9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        outer:while (true) {

            System.out.println("1:Find Area and Perimeter of Circle:");
            System.out.println("2:Find Area and Perimeter of Rectangle:");
            System.out.println("3:Find Area and Perimeter of Triangle:");
            System.out.println("4:exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Reduis of Circle:");
                    double r = obj.nextDouble();
                    circleDemo c = new circleDemo(r);
                    System.out.println("Area of Circle:" + c.area());
                    System.out.println("perimeter of Circle:" + c.perimeter());
                    break;
                case 2:
                    System.out.println("Enter Length of Rectangle:");
                    double l = obj.nextDouble();
                    System.out.println("Enter Breadth of Rectangle:");
                    double b = obj.nextDouble();
                    RectangleDemo rr = new RectangleDemo(l, b);
                    System.out.println("Area of Rectangle:" + rr.area());
                    System.out.println("perimeter of Rectangle:" + rr.perimeter());
                    break;
                case 3:

                    inner:while (true) {
                        System.out.println("1:Find Area of Triangle:");
                        System.out.println("2:Find  Perimeter of Triangle:");
                        System.out.println("3:exit");
                        System.out.println("Enetr your choice");
                        int ch = obj.nextInt();

                        switch (ch) {
                            case 1:
                                System.out.println("Enter Base of Triangle:");
                                double ba = obj.nextDouble();
                                System.out.println("Enter Height of Triangle:");
                                double h = obj.nextDouble();
                                TriangleDemo t = new TriangleDemo(ba, h);
                                System.out.println("Area of Triangle:" + t.area());
                                break;

                            case 2:
                                System.out.println("Enter A Value:");
                                double a = obj.nextDouble();
                                System.out.println("Enter B value:");
                                double b1 = obj.nextDouble();
                                System.out.println("Enter C value:");
                                double c1 = obj.nextDouble();
                                t = new TriangleDemo(a, b1, c1);
                                System.out.println(" perimeter of Triangle:" + t.perimeter());
                                break;
                            case 3:
                                    continue outer;

                        }

                    }

                case 4:
                    System.exit(1);

                default:
                    break;
            }

        }
    }
}