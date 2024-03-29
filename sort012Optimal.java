package ARRAYS;

public class sort012Optimal {
    public static void sort(int[]arr){
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }public static void main(String[] args) {
        int[]arr={0,1,1,0,1,2,1,2,0,0,0,2};
        sort(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
