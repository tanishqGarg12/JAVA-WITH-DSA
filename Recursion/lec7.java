import java.util.*;
public class lec7{

// reversal of strings
    // static String print(String ss,int idx){
    //     if (idx==ss.length()) {
    //         return "";
            
    //     }

    //     String str =print(ss, idx+1)+ss.charAt(idx);
    //     return str;
    // }



//removal of charater from a string\
    // static String print(String ss,int idx,char x){
    //     if (idx==ss.length()) {
    //         return "";
            
    //     }
    //     String small="";
    //     if (ss.charAt(idx)!=x) {
    //          small += ss.charAt(idx)+print(ss, idx+1, x) ;
            
    //     }
    //     else{
    //         small +=print(ss, idx+1, x) ;


    //     }
        
    //     return small;

        
    // }

    //palindrome check 
    static boolean print(String s , int r,int l){
        if(r>=l){
            return true;
        }
        return(s.charAt(r)==s.charAt(l) && print(s, r+1, l-1));
    }

    
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        char ch = 'a';
        // String ss=print(s,0,ch);
        // System.out.println(ss);
        // if (print(s, 0, s.length())) {
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }
        System.out.println(print(s, 0, s.length()-1));



    }
}