import java.util.*;

public class practise {
    static int search(int[]arr,int target){
        int st=0;
        int end= arr.length-1;
        while(st<=end) {
            int mid = st+(end-st)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]>target) {
                end= mid-1;
            }
            else
            st=mid+1;   
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int a;
        int n;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();  
        n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int b=search(arr,a);
        System.out.println(b);
    }
}


