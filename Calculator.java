class Calculator {
    // Method to calculate square of an integer
    public int calculate(int num) {
        return num * num;
    }

    // Overloaded method to calculate product of two integers
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }

    // Overloaded method to calculate cube of a float
    public float calculate(float num) {
        return num * num * num;
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test square of an integer
        int square = calc.calculate(5);
        System.out.println("Square of 5: " + square);

        // Test product of two integers
        int product = calc.calculate(4, 6);
        System.out.println("Product of 4 and 6: " + product);

        // Test cube of a float
        float cube = calc.calculate(2.5f);
        System.out.println("Cube of 2.5: " + cube);
    }
}
