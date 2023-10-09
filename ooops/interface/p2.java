// package interface;
interface computer{
    void compilecode();
}
// abstract class computer{
//     abstract void compilecode();
// }



class laptop implements computer{
    public void compilecode(){
        System.out.println("in compile code laptop");
    }
}
class desktop implements computer{  
    public void compilecode(){
        System.out.println("in compile code destop,faster");
    }
}

class developer{
            // obj1.compilecode();

    public void buildapp(){
        System.out.println("in build app");

        // laptop obj1 = new laptop();
        // obj1.compilecode();
    }
}


public class p2 {
    public static void main(String[] args) {

        // computer oject = new desktop();
        // oject.compilecode();




        developer obj = new developer();
        obj.buildapp();
        
    }
    
}
