package ARRAYS;

public class RotateByk {
    public static void reverse(int[]arr,int start,int end){
        if(start>end){
            return;
        }while (start<=end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }public static void rotate(int[]arr,int k){
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        rotate(arr, 2);
        for(int num:arr){
            System.out.print(num);
        }
    }
}
