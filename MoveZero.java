package ARRAYS;

import java.util.ArrayList;

public class MoveZero {
    public static void move(int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }for(int i=0;i<temp.size();i++){
           arr[i]=temp.get(i);
        }for(int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }
    }public static void moveOptimal(int[]arr){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0 && arr[j+1]!=0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j=-1;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,0,4,0,5,6,8,0,3};
        //move(arr);
        moveOptimal(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
