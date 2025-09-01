import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Define interface
interface ArrayOperations {
    void insert(int index, int value);

    int search(int value);

    void display();
}

// Step 2: Implement interface
class ArrayManager implements ArrayOperations {
    private int[] arr;

    public ArrayManager(int size) {
        arr = new int[size];
    }

    @Override
    public void insert(int index, int value) {
        try {
            arr[index] = value;
            System.out.println("Inserted " + value + " at index " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Invalid index " + index);
        }
    }

    @Override
    public int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1; // Not found
    }

    @Override
    public void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Step 3: Main class
public class ArrayOperationsSequential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Create array
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            ArrayManager manager = new ArrayManager(size);

            // Insert element
            System.out.print("Enter index to insert: ");
            int insertIndex = sc.nextInt();
            System.out.print("Enter value to insert: ");
            int insertValue = sc.nextInt();
            manager.insert(insertIndex, insertValue);

            // Search element
            System.out.print("Enter value to search: ");
            int searchValue = sc.nextInt();
            int foundIndex = manager.search(searchValue);
            if (foundIndex != -1)
                System.out.println("Value found at index " + foundIndex);
            else
                System.out.println("Value not found");

            // Display array
            manager.display();

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter integers only.");
        } finally {
            sc.close();
            System.out.println("✅ Program ended.");
        }
    }
}
