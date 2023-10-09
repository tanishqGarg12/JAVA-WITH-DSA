public class ansvalue_race {

    static boolean isPossible(int []a,int k,int dist){
        int kidPlace=1;
        int lastkid = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]-lastkid>=dist) {
                kidPlace++;
                lastkid=a[i];
            }

        }
        return kidPlace>=k;

    }

    static int raceTrack(int[]a,int k){
        if (k>a.length) {
            return -1;
        }
        int st=0;
        int end = (int)1e9;
        int ans = 0;

        while (st<=end) {
            int mid = (st+end)/2;
            if (isPossible(a,k,mid)) {
                ans=mid;
                st=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a={1,2,4,8,9};
        int k=2;
        int m=raceTrack(a, k);
        System.out.println(m);
    }
    
}
