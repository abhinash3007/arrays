package ARRAYS;

public class SingleAppearence {
    public static void brute(int[]arr){
        for(int i=0;i<arr.length;i++){
            //int num=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }if(count==1){
                System.out.println(i);
            }
        }
    }
    public static void sinlge(int[]arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
                System.out.println(i);
            }
        }
    }public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4,4};
        brute(arr);
        sinlge(arr);
    }
}
