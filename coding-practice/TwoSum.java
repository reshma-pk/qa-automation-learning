//This is a brute-force solution. We're checking pairs one by one.
public class TwoSum {


    public static void main(String[] args) {

        int[] numbers = {2, 7, 8, 1, 7, 4, 5};
        int target = 9;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Indexes: " + i + ", " + j);
                }
            }
        }
    }
}