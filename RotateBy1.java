package ARRAYS;

public class RotateBy1 {
    public static void rotate(int[]arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            arr[i-1]=arr[i];
        }arr[arr.length-1]=temp;
    }public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        rotate(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
