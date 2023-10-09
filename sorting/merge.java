import java.util.Arrays;
import java.util.*;
public class merge 
  {
    static public  void mregee(int [] arr,int l,int r)
    {
        int mid = (l+r)/2;
        int n1 = mid-l+1;
        int n2=r-mid;
        int [] ARR= new int[n1];
        int [] ALL= new int[n2];
        int k=l;
        for (int i = 0; i < ARR.length; i++) {
            ARR[i]=arr[k++];
        } 
        for (int j = 0; j < ALL.length; j++) {
            ALL[j]=arr[k++];
        }
        int i=0;
        int j =0;
        k=l;
        while (i<n1 && j<n2) {
            if (ARR[i]<ALL[j]) {
                arr[k++]=ARR[i++];
            }
            else{
                arr[k++]=ALL[j++];
            }
        }   
        while (i<n1) {
            arr[k++]=ARR[i++];
        }
        while (j<n2) {
            arr[k++]=ALL[j++];
        }
    }
    public static void sort(int []arr,int l,int r)
    {
        if (l>=r)return;
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);  
        mregee(arr,l,r);
    }
    public static void main(String[] args) {
        int [] arr={2,65,6,8,73,14};
        // System.out.println(Arrays.toString(arr);
        sort(arr,0,5 );
        System.out.println(Arrays.toString(arr));
    } 
}
