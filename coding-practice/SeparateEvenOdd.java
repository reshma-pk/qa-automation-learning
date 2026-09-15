//Separate even & odd into different arrays 

import java.util.ArrayList;
public class SeparateEvenOdd {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        for (int num:arr){
            if(num%2 == 0)
                evenList.add(num);
            else 
                oddList.add(num);
        }

        System.out.println("Even arraylist " + evenList);
        System.out.println("Odd arraylist " + oddList);

    }
}