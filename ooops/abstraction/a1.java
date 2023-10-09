abstract class airplane{
    abstract void takeoff();

    abstract void land();
    // abstract int a=52; tis can not be there
    void fly(){
        System.out.println("flu airplane");
    }
}

class airplane1 extends airplane{
    void takeoff(){
        System.out.println("airplane1 taking off");
    }

    void land(){
        System.out.println("airplane1 is landing");
    }
    void fly(){
        System.out.println("flu airplane1");
    }
    void paint(){
        System.out.println("paint airplane1");
    }


}
class airplane2 extends airplane{
    void takeoff(){
        System.out.println("airplane2 taking off");
    }

    void land(){
        System.out.println("airplane2 is landing");
    }
}



public class a1 {
    public static void main(String[] args) {
        airplane obj=new airplane1();
        obj.takeoff();
        obj.land();
        obj.fly();
        ((airplane1)obj).paint();
        // --------------------
        airplane obj1=new airplane2();
        obj1.takeoff();
        obj1.land();
        // airplane obj1=new airplane();//can not make the object of abastract


    }
    
}
