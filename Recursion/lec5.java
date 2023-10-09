public class lec5 {

    // static void maxx(int [] arr,int idx){
    //     if (arr[idx]==arr.length) {
    //         return;            
    //     }
    //     // int max=0;
    //     System.out.print(arr[idx]+" ");
    //     maxx( arr, idx+1);
    //     // System.out.println(a);
    // }


    // static int maxx(int [] arr,int idx){
    //     if (arr[idx]==arr.length) {
    //         return arr[idx];            
    //     }
    //     int small = maxx(arr, idx+1);
    //     return Math.max(arr[idx],small);
    //     // return arr[idx];
    // }
    static int maxx(int [] arr,int idx){
        if (arr[idx]==arr.length) {
            return arr[idx];            
        }
        return arr[idx]+ maxx(arr, idx+1);
        // return Math.max(arr[idx],small);
        // return arr[idx];
    }

    public static void main(String[] args) {
        int [] aarr={1,2,3,4,5,6};
        int a=maxx(aarr, 0);
        System.out.println(a);
    }
}
