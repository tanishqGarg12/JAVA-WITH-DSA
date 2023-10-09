import java.util.ArrayList;
public class lec8 {
    // static ArrayList<String> sebstring(String s){
    //     ArrayList ans = new ArrayList<String>();

    //     if (s.length()==0) {
    //         ans.add("");
    //         return ans;
            
    //     }
    //     char currentChar = s.charAt(0);
    //     ArrayList<String> smallans = sebstring(s.substring(1));

    //     for (String ss : smallans) {
    //         ans.add(ss);
    //         ans.add(currentChar+ss);
    //     }
    //     return ans;
    // }


    // static void prints(String s, String ss){
    //     if (s.length()==0) {
    //         System.out.println(ss);
    //         return;
    //     }

    //     // String currentchar = s.charAt(s.substring(1));
    //     String remaingString = s.substring(1);
    //     char currentchar = s.charAt(0);
    //     prints(remaingString, ss+currentchar);
    //     prints(remaingString, ss);
    // }
    static void prints(int [] arr,int idx,int sum){
        if (idx>=arr.length) {
            System.out.println(sum);
            return;  
        }
        prints(arr, idx+1, sum+arr[idx]);
        prints(arr, idx+1, sum);
    }
    public static void main(String[] args) {
        // String s="abc";
        // ArrayList<String> m= sebstring(s);
        // System.out.println(m);   
        
        // prints(s, " ");

        int [] arr ={2,4,5};
        prints(arr, 0, 0);

    }
}
