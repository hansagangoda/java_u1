import java.util.Scanner; //pro8

public class Matrix8 {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix8() {
        this.rows = 0;
        this.cols = 0;
        this.matrix = new double[0][0];
    }


    public Matrix8(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
    }


    public Matrix8(double[][] matrix) {
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            this.matrix[i] = matrix[i].clone();
        }
    }

    
    public void setValue(int row, int col, double value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        matrix[row][col] = value;
    }

    public double getValue(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return matrix[row][col];
    }


    public Matrix8 transpose() {
        Matrix8 transposed = new Matrix8(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed.setValue(j, i, matrix[i][j]);
            }
        }
        return transposed;
    }

    // Method to add another matrix
    public Matrix8 add(Matrix8 other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions for addition");
        }
        Matrix8 result = new Matrix8(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.matrix[i][j] + other.getValue(i, j));
            }
        }
        return result;
    }

    // Method to subtract another matrix
    public Matrix8 subtract(Matrix8 other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions for subtraction");
        }
        Matrix8 result = new Matrix8(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.matrix[i][j] - other.getValue(i, j));
            }
        }
        return result;
    }

    // Method to multiply with another matrix
    public Matrix8 multiply(Matrix8 other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Number of columns of the first matrix must equal number of rows of the second matrix");
        }
        Matrix8 result = new Matrix8(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += this.matrix[i][k] * other.getValue(k, j);
                }
                result.setValue(i, j, sum);
            }
        }
        return result;
    }

    // Method to calculate the determinant (for 2x2 matrix only)
    public double determinant() {
        if (rows != 2 || cols != 2) {
            throw new UnsupportedOperationException("Determinant calculation is supported only for 2x2 matrices");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to calculate the inverse (for 2x2 matrix only)
    public Matrix8 inverse() {
        if (rows != 2 || cols != 2) {
            throw new UnsupportedOperationException("Inverse calculation is supported only for 2x2 matrices");
        }
        double det = determinant();
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted");
        }
        Matrix8 inverse = new Matrix8(2, 2);
        inverse.setValue(0, 0, matrix[1][1] / det);
        inverse.setValue(0, 1, -matrix[0][1] / det);
        inverse.setValue(1, 0, -matrix[1][0] / det);
        inverse.setValue(1, 1, matrix[0][0] / det);
        return inverse;
    }

    // Override toString() method to print the matrix row-by-row
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for Matrix 1:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        Matrix8 m1 = new Matrix8(rows1, cols1);

        System.out.println("Enter the elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                m1.setValue(i, j, scanner.nextDouble());
            }
        }

        System.out.println("Enter the number of rows and columns for Matrix 2:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        Matrix8 m2 = new Matrix8(rows2, cols2);

        System.out.println("Enter the elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                m2.setValue(i, j, scanner.nextDouble());
            }
        }

        // Print matrices
        System.out.println("\nMatrix 1:");
        System.out.println(m1);

        System.out.println("Matrix 2:");
        System.out.println(m2);

        // Transpose matrices
        System.out.println("Transpose of Matrix 1:");
        System.out.println(m1.transpose());

        System.out.println("Transpose of Matrix 2:");
        System.out.println(m2.transpose());

        // Addition
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Matrix 1 + Matrix 2:");
            System.out.println(m1.add(m2));
        } else {
            System.out.println("Addition not possible: Matrices dimensions do not match.");
        }

        // Subtraction
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Matrix 1 - Matrix 2:");
            System.out.println(m1.subtract(m2));
        } else {
            System.out.println("Subtraction not possible: Matrices dimensions do not match.");
        }

        // Multiplication
        if (cols1 == rows2) {
            System.out.println("Matrix 1 * Matrix 2:");
            System.out.println(m1.multiply(m2));
        } else {
            System.out.println("Multiplication not possible: Number of columns of Matrix 1 must equal number of rows of Matrix 2.");
        }

        // Inverse (only for 2x2 matrix)
        if (rows1 == 2 && cols1 == 2) {
            System.out.println("Inverse of Matrix 1:");
            try {
                System.out.println(m1.inverse());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Inverse not possible: Matrix is not 2x2.");
        }
    }
}
