class animal // extend Object
{
    void sleep() {
        System.out.println("heloooo");
    }
    void sleepp() {
        System.out.println("heloooowwwww");
    }
}
class tiger extends animal {
    void sleep() {
        System.out.println("heloooo tiger");
    }
    void cramp() {
        System.out.println("tiger cramp");
    }
}
class btiger extends animal {
}
public class i4 {
    public static void main(String[] args) {
        btiger onj = new btiger();
        onj.sleep();
        onj.sleepp();
        tiger obj = new tiger();
        obj.sleep();
        obj.sleepp();
        obj.cramp();
    }
}
