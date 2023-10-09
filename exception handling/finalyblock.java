// import java.util.object.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finalyblock {
    public static void main(String[] args) {
        int n=0;
        Scanner sc =  new Scanner(System.in);
        try {
            n=sc.nextInt();

            System.out.println(n);
        } 
        catch (InputMismatchException e) 
        {

            System.out.println("enter ur number  "+e);
        }

        finally{
            sc.close();
        }

        // try need just one block weather it is finally or catch;
        // finlally block id not necesseary
        
    }
    
}

