package ARRAYS;

public class SortedArray {
    public static boolean sorted(int[]arr){
        if(arr.length==0 || arr.length==1){
            return true;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }return true;
    }public static void main(String[] args) {
        int[]arr={3,5,4,1,2};
        System.out.println(sorted(arr));
    }
}
