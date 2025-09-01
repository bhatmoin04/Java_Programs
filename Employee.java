class Employee {
    // Fields
    private int empId;
    private String name;
    private double basicSalary;

    // Constructor
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate HRA (House Rent Allowance) – 10% of basicSalary
    public double calculateHRA() {
        return 0.10 * basicSalary;
    }

    // Method to calculate DA (Dearness Allowance) – 20% of basicSalary
    public double calculateDA() {
        return 0.20 * basicSalary;
    }

    // Method to calculate Gross Salary = basic + HRA + DA
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Method to display employee details and salary calculations
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("-----------------------------");
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create 3 Employee objects
        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);
        Employee e3 = new Employee(103, "Charlie", 45000);

        // Display salary details for each employee
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
