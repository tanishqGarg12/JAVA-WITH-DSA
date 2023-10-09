// package Static;

public class launch_static {
    static int a;

    int b;

    static {
        System.out.println("control in static block");
        a = 45;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("main method");

        int m;
        int n;

    }

}
