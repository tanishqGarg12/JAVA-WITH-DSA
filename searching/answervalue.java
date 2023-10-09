public class answervalue {

    static boolean isdivisionpossible(int []arr,int m,int mxChocolate){
        int noofstudent=1;
        int choc=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mxChocolate) {
                return false;
            }
            if (choc + arr[i] <= mxChocolate) {
                choc +=arr[i];
            }
            else{
                noofstudent++;
                choc=arr[i];
            }
        }

        return noofstudent<=m;
        // if (noofstudent>m) {
        //     return false;
        // }
        // return true;
    }

    static int distributechocolate(int []a,int m){
        if (a.length<m) {
            return -1;
        }

        int ans =0;
        int st=1;
        int end = (int)1e9;
        while (st<=end) {
            int mid =st+(end-st)/2;
            if (isdivisionpossible(a,m,mid)) {
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={5,3,1,4,2};
        int m = distributechocolate(arr, 3);
        System.out.println(m);
    }
    
}
