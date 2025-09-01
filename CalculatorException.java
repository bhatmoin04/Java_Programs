public class CalculatorException {
    public static void main(String[] args) {
        int x = 9;
        int y = 0;
        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("There is divide by zero error");
        }
    }
}
