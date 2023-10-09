// package cla/sss;


interface a{
    void drive();
}

// class b implements a{
//     public void drive(){
//         System.out.println("the person is driving");
//     }
// }


public class anomynous_class 
{
    public static void main(String[] args) {
        
        a obj = new a(){
            public void drive(){
            System.out.println("i am driving");
        }
    };
    obj.drive();
    
        }
}
