public class test {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // An assertion that is expected to fail
        assert sum(a, b) == 15 : "Assertion failed: sum is not 20";

        System.out.println("This message won't be printed if assertions are enabled and the test fails.");
    }

    // A simple method that returns the sum of two integers
    public static int sum(int x, int y) {
        return x + y; // This returns 15, not 20
    }
}
