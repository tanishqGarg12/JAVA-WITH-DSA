import java.util.*;
public class binary {
    static int  search(int []arr,int x){
        int left=0;
        int right = arr.length;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if (arr[mid]==x) {
                // System.out.println(mid);
                return mid;
            }
            else if(arr[mid]<x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int y=search(arr,7);
        System.out.println(y);
    }
    
}
