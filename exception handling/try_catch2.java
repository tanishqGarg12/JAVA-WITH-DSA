public class try_catch2 {
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        int result =0;
        String  name =null;
        int [] arr = {1,2,3,4,5};
        try {
            // result=n1/n2;
            result=n1/name.length();
            System.out.println("anser is "+ result);
            System.out.println(arr[5]);
            
        } 
        // System.out.println("--------------------");
        catch (ArithmeticException e) 
        {
            System.out.println("enter the corect values--"+e);
            // TODO: handle exception
        }
        catch(IndexOutOfBoundsException e)
        {

            System.out.println("be in ur limits -->"+e);
        }
        catch(Exception e)
        {
            System.out.println("somethhing went wrong-->"+e);
        }


        System.out.println(result);
        System.out.println("bye");
    }
    
}

