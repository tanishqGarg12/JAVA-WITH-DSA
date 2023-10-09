public class peal_element {
    static int search(int[]arr){
        int st=0;
        int end = arr.length-1;
        int ans=-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if (arr[mid]<=arr[mid+1]) {
                ans=arr[mid+1];
                st=mid+1;
            }            
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,2,1};
        int m=search(arr);
        System.out.println(m);
    }
    
}
