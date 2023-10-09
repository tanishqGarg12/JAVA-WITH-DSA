public class problems {
    // static void sort(int [] arr)
    // {
    //     int x=-1;
    //     int y=-1;
    //     for (int i = 1; i < arr.length; i++)
    //     {
    //         if (arr[i-1]>arr[i]) 
    //         {
    //             if (x==-1) 
    //             {
                    
    //                 x=i-1;
    //                 y=i;
    //             }
    //             else
    //             {
    //                 y=i;
    //             }
    //         }
    //     }
    //     int temp = arr[x];
    //     arr[x]=arr[y];
    //     arr[y]=temp;
    // }
    // static void sort(int [] arr){
    //     int l=0;
    //     int r=arr.length;
    //     while (l<r) {
    //         while (arr[l]<0) {
    //             l--;
    //         }
    //         while (arr[r]>0) {
    //             r++;
    //         }
    //         if (l<r) {
                // int temp = arr[l];
                // arr[l]=arr[r];
                // arr[r]=temp;
                
    //         }
    //     }
    // }

    static void swap(int [] arr,int l,int r){
                int temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

    }

    static void sort012(int [] a){
        int l=0,mid=0,h=a.length-1;

        while (mid<=h) {
            if (a[mid]==0) {
                swap(a,mid,l);
                mid++;
                l++;
            }
            else if (a[mid]==1) {
                mid++;
            }
            else{
                swap(a,mid,h);
                h--;
            }
        }
    }
    public static void main(String[] args) {
        // int [] arr= {10,5,6,7,8,9,3};
        // sort(arr);
        int [] arr= {0,1,2,0,1,2,0,1,2,0,1};
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
