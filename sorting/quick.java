import java.util.Arrays;

public class quick {
    static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp; 
    }
    static int partition(int [] arr,int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1; i < arr.length; i++) {
            if (arr[i]<=pivot) {
                count++;
            }
        }
        int pivotidx= st+count;
        swap(arr,st,pivotidx);
        int i=st;
        int j=end;
        while (i<pivotidx && j>pivotidx) {
            if (arr[i]<=pivot) {
                i++;
            }
            if (arr[j]>=pivot) {
                j--;
            }
            if (i<pivotidx && j>pivotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }

    static void sort(int [] arr,int st,int end){
        if (st>=end) return;
        int p =partition(arr, st, end);
        sort(arr, st, p-1);
        sort(arr, p+1, end);
        
    }
    public static void main(String[] args) {
        int [] arr={5,1,2,3,9,4};
        // System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
