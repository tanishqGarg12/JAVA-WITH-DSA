import java.util.Scanner;

public class array6 {

    static void prntarray(int []arr,int n){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int [] prefixum(int [] arr,int n){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void  main(String [] args){{
        int n;
        System.out.println("enter the size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }  
        System.out.println("===========");
        // prefixum(arr, n);
        // prntarray(arr,n);
        int [] peff = prefixum(arr,n);
        prntarray(peff,n);


        // System.out.println("enter the number of q");
        // int q;
        // q=sc.nextInt();
        // while (q-- >0) {
        //     System.out.println("enter loxer and upper range");
        //     int l,u;
        //     l=sc.nextInt();
        //     u=sc.nextInt();
        //     int sum;
        //     sum = pefixtoLimit[u]-pefixtoLimit[l-1];
        //     System.out.println("sum  "+sum);


            
        // }
    }}
    
}
