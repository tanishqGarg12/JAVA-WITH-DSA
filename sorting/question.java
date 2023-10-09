import java.util.Arrays;
import java.util.*;

public class question {
    // static void sort(int[]arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length-i-1; j++) {
    //             if (arr[j]==0 && arr[j+1]!=0) {
    //                 int temp = arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }

    static void sort(String [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_idx])<0) {
                    // String temp = arr[j];
                    //  arr[j]=arr[j+1];
                    // arr[j+1]=temp;
                    min_idx=j;
                }

            }
            if (i!=min_idx) {
                String temp = arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
                
            }
                    
        }
    }
    public static void main(String[] args) {
        // int [] arr ={1,2,0,7,0,9};
        String [] arr={"abc","abc","abcd","der"};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
