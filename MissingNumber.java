package ARRAYS;

import java.util.ArrayList;

public class MissingNumber {
    // public static void brute(int[] arr) {
    //     int j = arr.length - 1;
    //     while (j > 0 && arr[j] - arr[j - 1] != 1) {
    //         System.out.println(arr[j]);
    //         j--;
    //     }
    // }        
    public static void missing(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }
    }public static void main(String[] args) {
        int[]arr={1,2,4,5,6};
        missing(arr);
    //    brute(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
