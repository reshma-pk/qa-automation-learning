//Search specific no. in an array
import java.util.Scanner;
public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50}; // sorted array
        int key = 30;

        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
