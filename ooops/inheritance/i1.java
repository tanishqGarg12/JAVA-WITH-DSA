// package inheritance;
// single level inheritance
class student {
    private String name;

    int age;

    student() {
        System.out.println("tanishq garg");
        System.out.println("heloooooo!!!!!!!!!");

    }

    void disp() {
        name = "tanishq";

        age = 45;
        System.out.println("hello hpw r u");
        System.out.println(age);
        System.out.println(name);
    }
}

class child extends student {
    void show() {
        System.out.println("the age is " + age);
    }

}

public class i1 {
    public static void main(String[] args) {

        child obj = new child();
        obj.disp();
        obj.show();

    }

}
