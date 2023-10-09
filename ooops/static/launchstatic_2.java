
import java.util.Scanner;

class intrest {
    int sp;
    int t;
    int amount;
    static int intrest;

    static {
        intrest = 2;

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the both values");
        t = sc.nextInt();
        amount = sc.nextInt();

    }

    void calc() {
        sp = (intrest * t * amount) / 100;
    }

    void sisp() {
        System.out.println("the ans is " + sp);
    }

}

public class launchstatic_2 {

    public static void main(String[] args) {

        intrest obj = new intrest();
        intrest obj1 = new intrest();

        obj.input();
        obj.calc();
        obj.sisp();

        obj1.input();
        obj1.calc();
        obj1.sisp();
    }

}
