import java.util.Arrays;

public class practise {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;

    }

    // static void bubble(int[]arr){
    // for (int i = 0; i < arr.length; i++) {
    // boolean sort=false;
    // for (int j = 0; j < arr.length-i-1; j++) {
    // if (arr[j]>arr[j+1]) {
    // swap(arr, j, j+1);
    // sort = true;
    // }
    // }
    // if (!sort) {
    // break;
    // }
    // }
    // }
    // static void insertion(int[]arr){
    // int j=0;
    // for (int i = 1; i < arr.length; i++) {
    // i=j;
    // while (j>0 && arr[j-1]>arr[j]) {
    // swap(arr, j-1, j);
    // j--;
    // }
    // }
    // }
    // static void selection(int[]arr){
    // // int min_idx=0;
    // for (int i = 0; i < arr.length; i++) {
    // int min_idx=i;
    // for (int j = i+1; j < arr.length; j++) {
    // if (arr[min_idx]>arr[j]) {
    // min_idx=j;
    // }

    // if (min_idx!=i) {
    // swap(arr, i, min_idx);
    // }
    // }
    // }
    // }

    // static void merge(int[] arr, int l, int r) {
    //     int mid = (l + r) / 2;
    //     int n1 = mid - l + 1;
    //     int n2 = r - mid;
    //     int k = l;
    //     int[] arrr = new int[n1];
    //     int[] all = new int[n2];
    //     for (int i = 0; i < n1; i++) {
    //         arrr[i] = arr[k++];
    //     }
    //     for (int i = 0; i < all.length; i++) {
    //         all[i] = arr[k++];
    //     }

    //     int i = 0;   
    //     int j = 0;
    //     k = l;
    //     while (i < n1 && j < n2) {
    //         if (arrr[i] < all[j]) {
    //             arr[k++] = arrr[i++];
    //         } else {
    //             arr[k++] = all[j++];
    //         }
    //     }
    //     while (i < n1) {
    //         arr[k++] = arrr[i++];
    //     }
    //     while (j < n2) {
    //         arr[k++] = all[j++];
    //     }
    // }
    // static void mergeSort(int[] arr, int l, int r) {
    //     if (l >= r) {
    //         return;
    //     }
    //     int mid = (l + r) / 2;
    //     mergeSort(arr, l, mid);
    //     mergeSort(arr, mid + 1, r);
    //     merge(arr, l, r);
    // }


    static int partition(int []arr,int st,int end){
        int pivot = arr[st];
        int count =0;
        for (int i = st+1; i < arr.length; i++) {
            if (arr[i]<arr[st]) {
                count++;
            }
        }
        int pivotIdx = st+count;
        
        swap(arr, st, pivotIdx);

        int i =st;
        int j=end;
        while (i<pivotIdx && j>pivotIdx) {
            while (i<pivotIdx) {
                i++;
            }
            while (j>pivotIdx) {
                j--;
            }
            if (i<pivotIdx && j>pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;

    }


    static void cout(int[]arr,int st,int end){
        if (st>=end) {
            return;
        }
        int p = partition(arr,st,end);
        cout(arr, st, p);
        cout(arr, p+1, end);
    }
    
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 2, 3, 1 };
        cout(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
