import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        // Handle negative numbers
        num = Math.abs(num);

        // Special case: if number is 0
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10; // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
