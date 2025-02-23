package JavaProgramming2.Part11.Exceptions.ValidatingParameters;

public class Calculator {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is only defined for non-negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid parameters: n and k must be non-negative and k should not exceed n.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
