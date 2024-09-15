public class Number { //pro4
    private double value;

    
    public Number(double value) {
        this.value = value;
    }


    public boolean isZero() {
        return value == 0.0;
    }

    
    public boolean isPositive() {
        return value > 0.0;
    }


    public boolean isNegative() {
        return value < 0.0;
    }

    
    public boolean isOdd() {
        if (value % 1 != 0) {
            return false; 
        }
        return ((int)value % 2 != 0);
    }

    
    public boolean isEven() {
        if (value % 1 != 0) {
            return false; 
        }
        return ((int)value % 2 == 0);
    }

    
    public double getFactorial() {
        if (value < 0 || value % 1 != 0) {
            throw new IllegalArgumentException("Factorial is only defined for non-negative integers.");
        }
        return factorial((int)value);
    }

    
    private double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        Number num1 = new Number(5.0);
        Number num2 = new Number(-3.0);
        Number num3 = new Number(0.0);
        Number num4 = new Number(4.0);
        Number num5 = new Number(2.5);

        System.out.println("Number 1 (5.0):");
        System.out.println("isZero(): " + num1.isZero());
        System.out.println("isPositive(): " + num1.isPositive());
        System.out.println("isNegative(): " + num1.isNegative());
        System.out.println("isOdd(): " + num1.isOdd());
        System.out.println("isEven(): " + num1.isEven());
        System.out.println("getFactorial(): " + num1.getFactorial());

        System.out.println("\nNumber 2 (-3.0):");
        System.out.println("isZero(): " + num2.isZero());
        System.out.println("isPositive(): " + num2.isPositive());
        System.out.println("isNegative(): " + num2.isNegative());
        System.out.println("isOdd(): " + num2.isOdd());
        System.out.println("isEven(): " + num2.isEven());

        System.out.println("\nNumber 3 (0.0):");
        System.out.println("isZero(): " + num3.isZero());
        System.out.println("isPositive(): " + num3.isPositive());
        System.out.println("isNegative(): " + num3.isNegative());
        System.out.println("isOdd(): " + num3.isOdd());
        System.out.println("isEven(): " + num3.isEven());
        System.out.println("getFactorial(): " + num3.getFactorial());

        System.out.println("\nNumber 4 (4.0):");
        System.out.println("isZero(): " + num4.isZero());
        System.out.println("isPositive(): " + num4.isPositive());
        System.out.println("isNegative(): " + num4.isNegative());
        System.out.println("isOdd(): " + num4.isOdd());
        System.out.println("isEven(): " + num4.isEven());
        System.out.println("getFactorial(): " + num4.getFactorial());

        System.out.println("\nNumber 5 (2.5):");
        System.out.println("isZero(): " + num5.isZero());
        System.out.println("isPositive(): " + num5.isPositive());
        System.out.println("isNegative(): " + num5.isNegative());
        System.out.println("isOdd(): " + num5.isOdd());
        System.out.println("isEven(): " + num5.isEven());
    }
}
