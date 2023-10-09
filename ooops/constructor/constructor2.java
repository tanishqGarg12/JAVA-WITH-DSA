// package constructor;
class demo {
    private int a;
    private int b;

    demo() {
        System.out.print("helloe");

    }

    demo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    

    public  void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }

}

public class constructor2 {

    public static void main(String[] args) {

        demo obj = new demo();
        obj.disp();

        demo obj1 = new demo(10, 20);
        obj1.disp();

    }

}
