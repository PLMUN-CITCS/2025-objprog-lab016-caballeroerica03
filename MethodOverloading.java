public class MethodOverloading {
    // Overloaded methods for different parameter types
    public static void printValue(int value) {
        System.out.println("Integer value: " + value);
    }

    public static void printValue(double value) {
        System.out.println("Double value: " + value);
    }

    public static void printValue(String value) {
        System.out.println("String value: " + value);
    }

    // Corrected main method
    public static void main(String[] args) {
        printValue(10);        // Calls printValue(int)
        printValue(3.14);      // Calls printValue(double)
        printValue("Hello!");  // Calls printValue(String)
    }
}
