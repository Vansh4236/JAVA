public package calculate;

class MathOperations {

    // Overloaded method for arithmetic operations
    void calculate(int a, int b) {
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("---------------------------");
    }

    // Overloaded method for matrix addition
    void calculate(int[][] m1, int[][] m2) {
        System.out.println("Matrix Addition:");
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    // Overloaded method for trigonometric functions
    void calculate(double angle) {
        System.out.println("Trigonometric Functions (angle in radians):");
        System.out.println("Sine: " + Math.sin(angle));
        System.out.println("Cosine: " + Math.cos(angle));
        System.out.println("Tangent: " + Math.tan(angle));
        System.out.println("---------------------------");
    }

    // Overloaded method for logarithmic calculations
    void calculate() {
        double number = 10.0;
        System.out.println("Logarithmic Calculation:");
        System.out.println("Log(" + number + ") = " + Math.log(number));
        System.out.println("---------------------------");
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        // Arithmetic
        obj.calculate(10, 5);

        // Matrix Addition
        int[][] m1 = { {1, 2}, {3, 4} };
        int[][] m2 = { {5, 6}, {7, 8} };
        obj.calculate(m1, m2);

        // Trigonometric functions (using 45 degrees = π/4 radians)
        obj.calculate(Math.PI / 4);

        // Logarithmic calculation
        obj.calculate();
    }
}
 {
    
}
