import java.util.Scanner;

class AreaCalculator {

    // Method to calculate area of a square
    public int area(int side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public int area(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        // Square area
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of square: " + calc.area(side));

        // Rectangle area
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        System.out.println("Area of rectangle: " + calc.area(length, breadth));

        // Circle area
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of circle: " + calc.area(radius));

        sc.close();
    }
}
