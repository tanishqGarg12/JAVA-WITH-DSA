import java.util.*;

public class pwskills {


    // static int factorial(int n){
    //     if (n==1|| n==0) {
    //         return 1;
    //     }
    //     else
    //     System.out.print( n*factorial(n-1)+" //");
    //     // System.out.println();
    //     return n*factorial(n-1);
    // }
    // static int fibonacci(int n){
    //     int a=0;
    //     int b=1;
    //     if (n==0 || n==1) {
    //         return n;
            
    //     }
    //     else{
    //         return fibonacci(n-2)+fibonacci(n-1);
    //     }
    // }


    // static int power(int n,int m){
    //     int res=0;
    //     int final_res=0;

    //     if (m==1) {
    //         return n;
            
    //     }

    //     else{
    //         res= power(n, m/2);
    //         final_res=res*res;

    //         if (m%2==0) {
    //             return final_res;
    //         }
    //         else{

    //             return n*final_res;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        int m;
        System.out.println("enter the value of m");
        m=sc.nextInt();

        int result = factorial(n);
        System.out.println();
        System.out.println("he factorial is "+result);

    }
    
}

