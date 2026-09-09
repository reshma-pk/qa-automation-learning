//Search specific string in an array.

public class SearchString {
    public static void main(String[] args) {

        // Define array with string values
        String[] arr = {"Apple", "Banana", "Mango", "Orange"};

        String key = "Mango"; // String to search
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {  // use equals() for String comparison
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
