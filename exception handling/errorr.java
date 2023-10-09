// package exception handling;
class a{
}

public class errorr {
    public static void main(String[] args) 
    {
        int n=5;
        int m =0;
        int result =0;

        try {
            if (m<=0) 
            {
                // System.out.println("enter a valid number");
                // throw e;
                Exception e = new Exception();
                throw e;
                
            }
            else{
                result = n/m;
            }
        } 
        catch (Exception e) 
        {
            System.out.println("enter the valid number");
            // TODO: handle exception
        }



        

    }   
}

