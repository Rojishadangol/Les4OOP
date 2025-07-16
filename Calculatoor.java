public class Calculatoor {

    // a) Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // b) Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // c) Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing method a)
        int sum1 = calc.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);

        // Testing method b)
        double sum2 = calc.add(5.5, 6.8);
        System.out.println("Sum of two doubles: " + sum2);

        // Testing method c)
        int sum3 = calc.add(3, 4, 5);
        System.out.println("Sum of three integers: " + sum3);
    }
}
