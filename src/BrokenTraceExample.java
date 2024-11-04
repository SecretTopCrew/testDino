public class BrokenTraceExample {

        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e) {
                // This will print a stack trace with incomplete information
                System.out.println("Caught exception: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public static void method1() {
            try {
                method2();
            } catch (Exception e) {
                // Re-throwing a new exception without preserving the original cause
                throw new RuntimeException("Error occurred in method1, but hiding the real cause");
            }
        }

        public static void method2() {
            try {
                method3();
            } catch (Exception e) {
                // Re-throwing a generic exception, breaking the original trace
                throw new IllegalStateException("Something went wrong in method2");
            }
        }

        public static void method3() {
            // Triggering the actual error
            int result = 10 / 0; // This will cause an ArithmeticException
        }
    }

