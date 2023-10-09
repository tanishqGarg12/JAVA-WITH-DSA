public class try_catch {
    public static void main(String[] args) {
        int n1=5;
        int n2=0;
        int result =0;
        try {
            result=n1/n2;
            System.out.println("anser is "+ result);
            
        } 
        // System.out.println("--------------------");
        catch (Exception e) {
            System.out.println("there is error in the solutionm====>>>>"+e);
            // TODO: handle exception
        }


        System.out.println(result);
        System.out.println("bye");
    }
    
}
