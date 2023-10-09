import java.util.*;

public class lec4 {

    static int gcd(int x,int y){
        if (y==0) {
            return x;
            
        }
        else
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        // int t=gcd(x, y);
        // System.out.println(t);      
        
        
 
        while (x%y!=0) {
            int rem = x%y;
            x=y;
            y=rem;

            
        }
        System.out.println(y);
    }
    
}
