public class Circle { //pro6
    
    private double x;
    private double y;
    private double r;

    
    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.r = 1.0;
    }

    
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    
    public Circle(double r) {
        this(0.0, 0.0, r);
    }

    
    public double area() {
        return Math.PI * r * r;
    }


    public double circumference() {
        return 2 * Math.PI * r;
    }

    
    public double diameter() {
        return 2 * r;
    }

    
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0, 4.0, 5.0);
        Circle circle3 = new Circle(7.0);

        System.out.println("Circle 1:");
        System.out.println("Center: (" + circle1.x + ", " + circle1.y + ")");
        System.out.println("Radius: " + circle1.r);
        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Diameter: " + circle1.diameter());

        System.out.println("\nCircle 2:");
        System.out.println("Center: (" + circle2.x + ", " + circle2.y + ")");
        System.out.println("Radius: " + circle2.r);
        System.out.println("Area: " + circle2.area());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Diameter: " + circle2.diameter());

        System.out.println("\nCircle 3:");
        System.out.println("Center: (" + circle3.x + ", " + circle3.y + ")");
        System.out.println("Radius: " + circle3.r);
        System.out.println("Area: " + circle3.area());
        System.out.println("Circumference: " + circle3.circumference());
        System.out.println("Diameter: " + circle3.diameter());
    }
}
