import java.util.HashSet;
public class FindDuplicateString {
    public static void main(String[] args) {
        String[] str = {"apple", "banana", "apple", "orange", "banana"};
        HashSet<String> set = new HashSet<>();

        for(String fruit:str) {
            if(!set.add(fruit)) {
                System.out.println("Duplicates:" + fruit);
            }
        }

    }
}