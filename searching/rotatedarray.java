public class rotatedarray {
    static int search(int[]arr){
        int st=0;
        int n=arr.length;
        int end=n-1;
        int ans=-1;
        while(st<=end){
        int mid = (st+end)/2;
        if (arr[mid]<=arr[n-1]) {
            ans=arr[mid];
            end = mid-1;
        }
        else{
            st=mid+1;
        }

    }
    return ans;
    }
    public static void main(String[] args) {
        int [] arr={9,5,6,1,2};
        int m=search(arr);
        System.out.println(m);
    }
    
}
