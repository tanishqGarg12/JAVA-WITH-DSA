package encapsulation;

// java.object.util.*
class student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        // age=54;
        this.name = "tanishq";
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.print(age + name);
    }

}

public class encapsulation {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        // obj.age=54;
        // obj.name="tanishq";
        // obj.changedata();
        obj.setAge(55);
        obj1.setAge(552);
        obj.setName("tanishq garg");

        // obj1.show();
        System.out.println();

        int studage = obj.getAge();
        int studage1 = obj1.getAge();
        System.out.println(studage);
        System.out.println(studage1);

        // obj.show();
    }

}
