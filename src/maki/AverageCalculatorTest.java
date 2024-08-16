package maki;

public class AverageCalculatorTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 15;

        // Incorrect assertion: Expected average is mistakenly set to 12 instead of 10
        assert AverageCalculator.calculateAverage(num1, num2) == 12 :
                "Assertion failed: The average is not 12";

        System.out.println("Test passed!");
    }
}
