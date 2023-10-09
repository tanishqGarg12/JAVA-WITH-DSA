import java.util.*;
public class firstoccirance {
    static int  search(int []arr,int x){
        int left=0;
        int right = arr.length;
        int result = 0;
        while (left<=right) {
            int mid = left + (right-left)/2;
            if (arr[mid]==x) {
                result = mid;
                // System.out.println(mid);
                right = mid - 1;
                // return mid;
            }
            else if(arr[mid]<x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,7,5,6,7};
        int y=search(arr,7);
        System.out.println(y);
    }
    
}
