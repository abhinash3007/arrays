package ARRAYS;

import java.util.Arrays;

public class Sum2Problem {
    public static void sum(int[]arr,int target){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public static void optimal(int[]arr,int target){
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j]<target){
                i++;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                System.out.println(i+" "+j);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,6,5,8,11};
        sum(arr, 14);
        optimal(arr,14);
    }
}
