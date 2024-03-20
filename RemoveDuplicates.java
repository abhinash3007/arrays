package ARRAYS;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void duplicates(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { // Change loop condition to iterate over the entire array
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                temp.add(arr[i]);
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        duplicates(arr);
    }
}
