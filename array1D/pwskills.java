import java.util.*;

public class pwskills {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println(n);
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }

// reverse'
        // for (int i = 0; i < arr.length/2; i++) {
        //     int temp = arr[i];
        //     arr[i]=arr[n-1-i];
        //     arr[n-1-i]=temp;
        
        // }
        System.out.println("revered araay");
// palindrome
        //     int flag =0;
        // for (int i = 0; i < arr.length/2; i++) {
        //     if (arr[i]!=arr[n-i-1]) {
        //         // System.out.println("not palindrome");
        //         flag =1;
        //         break;
        //     }
        // }
        // if (flag==0) {
        //     System.out.println("plaindrome");
        // }
        // else{
        //     System.out.println("not palindrome");
        // }


        // missing number'

        // int m = 7;
        int result =0;
        result = ((n+1)*(n+2))/2;
        System.out.println("the missing number is  "+(result-sum));
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
