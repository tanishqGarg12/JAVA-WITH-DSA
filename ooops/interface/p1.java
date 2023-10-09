interface Innerp1 
{
    void show();
}
interface Innerp2 
{
    // public static final
    void showw();
}

class don implements Innerp1,Innerp2
{
    public void show(){
        System.out.println("in show");
    }

    public void showw(){
        System.out.println("in showw");
    }
}


public class p1 {
    public static void main(String[] args) {

        // Innerp1 obj = new don();
        // obj.show();
        don obj = new don();
        obj.show();
        obj.showw();

        
    }
}
