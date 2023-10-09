// package exception handling;
class a{
    public void b()throws Exception
    {
        c();
    }
    public void c()throws Exception
    {
        int n=4;
        int m=0;
        int result=0;
        result = n/m;
        System.out.println("the resukt is result"+result);
    }
}
public class duckinf {
    public static void main(String[] args) {
        
        a obj = new a();
        try {
            obj.b();
            
        } catch (Exception e) {
            System.out.println("ther is an errer "+e.getMessage());
            // TODO: handle exception
        }
    }   
}
