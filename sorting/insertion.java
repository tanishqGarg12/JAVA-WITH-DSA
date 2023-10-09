import java.util.*;
public class insertion {
    static void sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={9,4,5,2,1,78};
        sort(arr);
        System.out.println(Arrays.toString(arr));    
    }
}
