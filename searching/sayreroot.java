import java.util.*;
public class sayreroot {
    static int  search(int num){
        int left=0;
        int right = num;
        int result =-1;
        while (left<=right) {
            int mid = left + (right-left)/2;
            int val=mid*mid;
            if (val==num) {
                // System.out.println(mid);
                return mid;
            }
            else if(num>val){
                result =  mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int [] arr={1,2,3,4,5,6,7};
        int y=search(12);
        System.out.println(y);
    }
    
}

