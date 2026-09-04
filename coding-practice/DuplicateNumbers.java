//Given an integer array, find the two numbers that appear more than once and return them 
//(assume exactly two numbers are duplicated, rest are unique).  

import java.util.HashSet;

public class DuplicateNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 2, 5, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    }
}