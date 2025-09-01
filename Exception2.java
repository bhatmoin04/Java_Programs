public class Exception2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[9] = 10;
            System.err.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("The array is out of bounds ");
        }
    }
}
