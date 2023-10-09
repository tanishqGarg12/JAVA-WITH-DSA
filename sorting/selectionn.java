// package sorting;
import java.util.*;

public class selectionn {
    static void sort(int [] arr){
        int min_idx=0;
        for (int i = 0; i < arr.length-1; i++) {
            min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min_idx]>arr[j]) {
                    min_idx=j;
                }
            }
            if (min_idx!=i) {
                int temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={12,4,98,2,325,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}   
