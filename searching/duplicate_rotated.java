public class roatedaraay_search {
    static int search(int []a){

        int st=0;
        int end =a.length-1;
        int target=2;
        while (st<=end) {
            
        
        int mid=(st+end)/2;
        if (a[mid]==target) {
            return mid;
        }
        else if (a[st]==a[mid] && a[end]==a[mid]) {
            st++;
            end--;
        }
        else if (a[mid]<a[end]) {
            if (target>a[mid] && target<=a[end]) {
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        else{
           if (target>a[st] && target<=a[mid]) {
                end=mid-1;
           } 
           else{
            st=mid+1;
           }
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int []a={3,4,5,1,2};
        int target = 2;

        int m=search(a);
        System.out.println(m);
    }
    
}
