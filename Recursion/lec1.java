import java.util.Scanner;

public class lec1 {

    static void naturakl(int n){
        if (n==1) {
            System.out.println(n);` 
            return;
            
        }

        else{
            naturakl(n-1);
             System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        naturakl(n);
        
    }
    
}
