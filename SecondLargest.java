package ARRAYS;

public class SecondLargest {
    public static void second(int[]arr){
        int lar=arr[0];
        int slar=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>lar){
                lar=slar;
                lar=arr[i];
            }else if(arr[i]<lar && arr[i]>slar){
                slar=arr[i];
            }
        }System.out.println(slar);
    }
    public static void secondSmallest(int[]arr){
        int smallest=arr[0];
        int secSmall=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<smallest){
                secSmall=smallest;
                smallest=arr[i];
            }else if(arr[i]>smallest && arr[i]<secSmall){
                secSmall=arr[i];
            }
        }System.out.println(secSmall);
    }
    public static void main(String[] args) {
        int[]arr={1,24,5,3,24};
        second(arr);
        secondSmallest(arr);
    }
}
