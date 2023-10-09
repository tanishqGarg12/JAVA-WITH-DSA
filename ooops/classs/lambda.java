// package cla/sss;


interface a{
    void drive(int a,int b);
}

// works for functional only so no two methods can be made

public class lambda 
{
    public static void main(String[] args) {
        
        a obj  = (int a,int b) -> {
            System.out.println("i am driving"+a);
        
    };
    obj.drive(45,879);
    
        }
}
