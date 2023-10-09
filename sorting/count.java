import java.lang.reflect.Array;
import java.util.Arrays;

public class count {
    static void sort(int [] arr){
        int n=arr.length;
        int [] output = new int[n];

        int max=0;
        for (int i = 0; i < output.length; i++) {
            if (arr[i]>max) {
                max=arr[i];}}
        int [] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        for (int i = n-1; i >=0; i--) {
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int [] arr={2,5,4,7,8,6,2,5};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
