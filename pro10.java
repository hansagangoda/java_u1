public class pro10 { //pro10

    
    interface Shape {
        double area();
        double perimeter();
    }


    static class Rectangle implements Shape {
        private double width;
        private double height;

        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        
        @Override
        public double area() {
            return width * height;
        }

    
        @Override
        public double perimeter() {
            return 2 * (width + height);
        }
    }


    static class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;

        
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    
        @Override
        public double area() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        
        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }


    static class Circle implements Shape {
        private double radius;

        
        public Circle(double radius) {
            this.radius = radius;
        }

        
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

    
        Shape circle = new Circle(7);
        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
    }
}
