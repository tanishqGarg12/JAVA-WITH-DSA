class calc {
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("in stativ method ");        
        a = 10;
        b = 20;
    }

    {
        System.out.println("in non static block");
        m = 30;
        n = 40;
    }

    static void disp() {
        System.out.println(a + " " + b);
    }

    void disp1() {
        {
            System.out.println(m + " " + n);
        }
    }
}

public class lqunch_static1 {

    public static void main(String[] args) {
        // calc.static;
        calc.disp();
        // static can be called without makin object

        calc obj = new calc();
        obj.disp1();

    }

}
