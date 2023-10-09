import java.util.*;
public class lec3 {
    // static void multiple(int n,int k){
    //     // if (k==0) {
    //     //     return ;
            
    //     // }
    //     // else{
    //     //     multiple(n, k-1);
    //     //     System.out.println(n*k);
    //     //     // int m = n*k;
    //     //     // System.out.println(m);
    //     // }


    //     if (n==0) {
            
            
    //     }
    // }
    static int multiple(int n){
        if (n==0) {
            return n;
        }

        if (n%2==0) {
            return multiple(n-1)-n;
        }
        else {
            return multiple(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n,k;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int l=multiple(n);
        System.out.println(l);
    }
}
