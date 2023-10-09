import java.util.Scanner;
import java.util.*;

public class questions {
    public static void main(String[] args) {
        // String str="abcabcaa";
        System.out.println("enter the value of string");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();


        // palindrome and string reversal without inbulit
        String str1="";
        // for (int i = str.length()-1; i >=0; i--) {
        //     str1= str1+str.charAt(i);
        // }

        // System.out.println(str1);

        // if (str.equals(str1)) {
        //     System.out.println("string is palindrome  "+str+"<------------------>"+str1);
            
        // }

        // to remove the duplicate chharacter

        System.out.println(str);

        // str1= str.split(" ");

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int idx = str.indexOf(ch, i+1);

            if (idx==-1) {
                str1=str1+ch;
                
            }
        }


        System.out.println(str1);


    }
    
}
