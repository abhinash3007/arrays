package ARRAYS;

public class ConcequenceOne {
    public static void consequence(int[]arr){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1){
                count++;
                //max++;
            }else{
                count=0;
            }
            max=Math.max(max, count);
        }
        System.out.println(max);
    }public static void main(String[] args) {
        int[]arr={1,1,0,1,1,1,0,1,1,0,1,1};
        consequence(arr);
    }
}
