package ARRAYS;

import java.util.HashMap;
public class LongestSubArrays {
    public static void subArrays(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    System.out.println(i + " " + j);
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max);
    }

    public static void lenOfLongSubarr(int arr[], int K) {
        int i = 0, j = 0, sum = 0;
        int maxLen = Integer.MIN_VALUE;
        while(j<arr.length) {
            sum+=arr[j];
            if(sum<K) {
                j++;
            }else if(sum == K){
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }else if(sum > K){
                while(sum > K){
                    sum -= arr[i];
                    i++;
                }if(sum == K){
                    maxLen = Math.max(maxLen, j - i + 1);
                }j++;
            }
        }System.out.println(maxLen);
    }public static void countSub(int[]arr,int k){
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for (int i = 0; i < arr.length; i++) {
            prefix+=arr[i];
            if(prefix==k){
                max=Math.max(max, i+1);
            }
            if(map.containsKey(prefix-k)){
                int len=i-map.get(prefix-k);
                max=Math.max(max, len);
            }map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        subArrays(arr, 15);
        lenOfLongSubarr(arr, 15);
        countSub(arr, 15);
    }
}
