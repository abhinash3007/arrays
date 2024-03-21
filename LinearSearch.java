package ARRAYS;

public class LinearSearch {
    public static int linearSearch(int[]arr,int num){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==num){
                return i;
            }
        }return -1;
    }public static void main(String[] args) {
        int[]arr={9,8,7,2,5,6,4};
        System.out.println(linearSearch(arr, 6));
    }
}
