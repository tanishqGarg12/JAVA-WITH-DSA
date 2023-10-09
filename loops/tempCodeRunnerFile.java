
import java.util.Scanner;

public class patterns{
    public static void main(String[] args) {
        int m;
        System.out.println("enter the value of m");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j || i+j==m-1 || i==0 || j==0 || i==m-1 || j==m-1) {
                    
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
            
        }
    }
}