// import java.util.*;
// class solutions{
//     public static void main(String [] args){
//         StringBuffer a= new StringBuffer();
//         Scanner sc = new Scanner(System.in);
//         // a=sc.nextLine();
//         System.out.println("enter the value");
//         a.append(sc.nextLine());
//         StringBuffer b = new StringBuffer();
//         b= a.reverse();
        
//         if (a.equals(b)) {
//             System.out.print("Yes");
            
//         }
//         else{
//             System.out.print("No");
//         }
//     }
// }


// import java.io.*;
import java.util.*;
;

public class solutions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a;
        a=sc.nextInt();
        String s;
        for (int i = 1; i <= a; i++) {
            s = sc.nextLine();
            System.out.println(i+" "+s);
        }
        
    }
}