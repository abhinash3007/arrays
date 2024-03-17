package ARRAYS;

import BASICMATHS.printAllDivisors;

public class LargestElement {
    public static void largest(int[]arr){
        int lar=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>lar){
                lar=arr[i];
            }
        }System.out.println(lar);
    }public static void main(String[] args) {
        int[]arr={3,2,1,5,2};
        largest(arr);
    }
}
