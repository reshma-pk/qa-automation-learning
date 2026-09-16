public class SecondLargest {
   public static void main(String[] args) {

       int[] arr = {10, 20, 5, 30, 25};

       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;

       for (int num : arr) {
           if (num > largest) {
               secondLargest = largest;
               largest = num;
           } else if (num > secondLargest && num != largest) {
               secondLargest = num;
           }
       }

       System.out.println("Second largest element: " + secondLargest);
       System.out.println("Largest element: " + largest);
   }
}
