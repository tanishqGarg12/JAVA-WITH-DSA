import java.util.Arrays;

public class radixx {


    static void radix(int[]arr,int place){
        int n=arr.length;
        int [] output = new int[n];
        int [] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i]/place)%10]++;
        }
        for (int i = 0; i < count.length; i++) {
            count[i]+=count[i-1];
        }
        for (int i = n-1; i >0; i--) {
            int idx = count[(arr[i]/place)%10];
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
            
        }


    }

    static void sort(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        for (int place = 1; max/place>0; place*=10 ) 
        {
            radix(arr,place);
        }
    }
    public static void main(String[] args) {
        int [] arr={2,5,4,6,3,1,98,8};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        // int place;
        System.out.println(Arrays.toString(arr));
    }
    
}
