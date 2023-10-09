// package constructor;

class student {
    private int a;
    private int b;

    student() {
        this(54, 87);
        System.out.println("defaukt method is called");
        a = 78;
        b = 89;
    }
    student(int a) {

        this();
        // this is used to call neigbour constructior

        // super()-->this is default at top which calls parent constuctor
        // System.out.println("defaukt method is called");
        this.a = a;
        b = 89;
    }
    student(int a, int b) {
        // System.out.println("defaukt method is called");
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    void didp() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class constructor3 {
    public static void main(String[] args) {
        student s = new student();
        s.didp();
        student s1 = new student(875);
        s1.didp();
        student s2 = new student(98745, 213654);
        s2.didp();
    }
}
