import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class raghav {

    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the string");
        // String str;
        // str=sc.nextLine();
        // System.out.println(str);
        // String gtr="grt";
        // // .compareto()-->compare strings in lexographicsl order 
        // // 0if equals    +ve if first is positve   -ve if seccond id greator
        // // .contains if string is present

        // System.out.println(str.compareTo(gtr));

        // String str="abcd";
        // String gtr="abcc";
        // System.out.println(str==gtr);
        // String a1 = new String("abcc");
        // String a2 = new String("abcc");
        // System.out.println(a1==a2);
        // System.out.println(a1==str);

        // System.out.println(str.length());

        // for (int i = 0; i <= (str.length())-1; i++)
        // {
        //     for (int j = i+1; j<= (str.length()); j++) 
        //     {
        //         System.out.println(str.substring(i, j));
        //         }
        // };

// setbuider
        // .setcharat;
        // .delete(i,j)


        StringBuilder s1 = new StringBuilder("tanIShQ gaRG");
        StringBuilder s2 = new StringBuilder();

        // lower to upper and uper to lower at same time
        // for (int i = 0; i < s1.length(); i++) {
            
        //     char ch=s1.charAt(i);
        //     int ascii=(int)ch;
        //     boolean flag= true;

        //     if (ascii>=97) {
        //         flag=false;
                
        //     }
        //     if (ch ==' ') {
        //         continue;              
        //     }
            

        //     if (flag==true) {
        //         ascii=ascii+32;
        //         char dh = (char)ascii;
        //         s1.setCharAt(i,dh);
                
        //         // ((int)str.charAt(i))-32;

                
        //     }

        //     if (flag==false) {
        //         ascii=ascii-32;
        //         char dh = (char)ascii;
        //         s1.setCharAt(i,dh);
                
        //     }
        // }
        // System.out.println(s1);


        // System.out.println(s1.reverse());
        // String str;
// reverse
        // for (int i = 0; i < s1.length(); i++) {

        //     char c= s1.charAt(i);
        //     int j=0;
        //     int k=0;
        //     if (c == ' ') {
        //         j=i;

        //         // System.out.println(s1);
        //         // String s=s1.substring(0, j);
        //         s2.append((s1.substring(k, j)));
        //         // System.out.println(s2);
        //         s2.reverse();
        //         k=j+1; 




                

                



                
        //     }
        //     // char ch = s1.subSequence(i, )
        // }
        // System.out.println(s2);

    

// reverse strng with sequence
        // String str ="tanishq garg";
        // String str2 ="";
        // String []strr= str.split(" ");
        // for (String ele : strr) {
        //     // System.out.print(ele.length());


        //     for (int i = ele.length()-1; i >=0 ; i--) {
        //         str2=str2+ele.charAt(i);
        //     }

        //     str2=str2+" ";
        // }

        // System.out.print(str2);


        // int [] arr={1,2,3,5,4};
        // Arrays.sort(arr);
        // // System.out.print(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }


        // sorting string
        // String str="abcdefaaabbbbbbbccccccccc ";
        // String []ch = str.split("");
        // Arrays.sort(ch);

        // for (String string : ch) {
        //     System.out.print(string);
        // }

        // elemen chk

        // String str="tanishq";
        // char ch='e';
        // boolean flag = true;
        // for (int i = 0; i < str.length(); i++) {
        //     if (ch==str.charAt(i)) {
        //         // System.out.println("yes");
        //         flag=true;
                
        //     }
        //     else{
        //         // System.out.println("no");
        //         flag=false;
        //     }
        // }

        // if (flag) {
        //     System.out.println("yes");
            
        // }
        // else{
        //     System.out.println("no");
        // }

// // removinf vowel
//         String str= "\"Hello,\r\n" + //
//                 "\r\n" + //
//                 "have a good day\".";
//         String str1="";
//         for (int i = 0; i < str.length(); i++) {
//             char ch=str.charAt(i);
//             if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
//              {
//                 continue;

                
//             }
//             else
//             str1=str1+ch;
//         }

//         System.out.println(str1);



        String str ="aabbbcccdddeeee";
        String ans = ""+ str.charAt(0);
        int count =1;
        for (int i = 1; i < str.length(); i++) {
                char current = str.charAt(i);
                char prev = str.charAt(i-1);
                if (current==prev) {
                        count++;
                        
                }
                else{
                        ans+=count;
                        count=1;
                        ans+=current;
                }

        }
        if(count>1)ans+=count;
        System.out.println(ans);
    }
}