package ARRAYS;

import java.util.ArrayList;

public class UnionArray {
    public static void union(int[] arr1, int[] arr2) {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(i == arr1.length - 1 || arr1[i]!=arr1[i+1]){
                temp.add(arr1[i]);
            }
        }for(int j=0;j<arr2.length;j++){
            if(j==arr2.length-1 || arr2[j]!=arr2[j+1]){
                temp.add(arr2[j]);
            }
        }System.out.println(temp);
        ArrayList<Integer > Union=new ArrayList<>();
        for(int i=0;i<temp.size();i++){
            if (Union.size() == 0 || Union.get(Union.size()-1) != temp.get(i)){
                Union.add(temp.get(i));
                i++;   
            }
        }System.out.println(Union);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (i == temp.size() - 1 || temp.get(i) != temp.get(i + 1)) {
                result.add(temp.get(i));
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2, 2, 3, 3 };
        int[] arr2 = { 2, 2, 4, 4, 4, 5, 5, 5 };
        union(arr1, arr2);
    }
}
