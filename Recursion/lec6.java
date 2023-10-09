import java.util.*;

public class lec6{

    // static Boolean searchh(int []arr,int x,int idx){
    //     if (idx>=arr.length) {
    //         return false;            
    //     }
    //     if (arr[idx]==x) {
    //         return true;
    //     }
    //     return searchh(arr, x, idx+1);

    // }
    // static int searchh(int []arr,int x,int idx){
    //     if (idx>=arr.length) {
    //         return -1;            
    //     }
    //     if (arr[idx]==x) {
    //         return idx;
    //     }
    //     return searchh(arr, x, idx+1);

    // }
    // static void searchh(int []arr,int x,int idx){
    //     if (idx>=arr.length) {
    //         return;            
    //     }
    //     if (arr[idx]==x) {
    //         // return idx;
    //         System.out.println("the wlwment is found at "+idx);
    //     }
    //     searchh(arr, x, idx+1);

    // }

    static ArrayList<Integer> searchh(int []arr,int x,int idx){
        if (idx>=arr.length) {
            return new ArrayList<Integer>();            
        }

        ArrayList ans = new ArrayList<Integer>();
        if (arr[idx]==x) {
            ans.add(idx);
        }
        ArrayList Small_ans = searchh(arr, x, idx+1);
        ans.addAll(Small_ans);
        // ans.add(searchh(arr, x, idx+1));
        // searchh(arr, x, idx+1);
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,1,5,6,1,1};
        int x= 1;
        ArrayList ww=searchh(arr, x, 0);
        System.out.println(ww);
        System.out.println("the length of the araay is "+arr.length);
        // System.out.println(m);

    }
}