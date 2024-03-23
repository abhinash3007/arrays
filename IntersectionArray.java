package ARRAYS;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArray {
    public static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                   // break;  // Break out of inner loop once a match is found
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 7};

        intersection(arr1, arr2);
    }
}
