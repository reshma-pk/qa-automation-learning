public class MinMaxArray {
   public static void main(String[] args) {

       int[] arr = {10, 5, 25, 3, 40, 15};

       int min = arr[0];
       int max = arr[0];

       for (int num:arr) {
           if (num < min) {
               min = num;
           }
           if (num > max) {
               max = num;
           }
       }

       System.out.println("Smallest element: " + min);
       System.out.println("Greatest element: " + max);
   }
}
