public class Utility { //pro3

    
    public static long factorial(long value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        long result = 1;
        for (long i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isEven(long value) {
        return value % 2 == 0;
    }

    
    public static boolean isOdd(long value) {
        return value % 2 != 0;
    }

    public static void main(String[] args) {
        
        long testFactorial = 5;
        int testPrime = 29;
        long testEven = 8;
        long testOdd = 13;

        System.out.println("Factorial of " + testFactorial + " is: " + factorial(testFactorial));
        System.out.println(testPrime + " is prime: " + isPrime(testPrime));
        System.out.println(testEven + " is even: " + isEven(testEven));
        System.out.println(testOdd + " is odd: " + isOdd(testOdd));
    }
}