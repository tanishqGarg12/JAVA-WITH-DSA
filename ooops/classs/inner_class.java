class animala {
    public void talk() {
        System.out.println("animal talking");
    }
    // inner clas --> static member anomynous
    // defalut is member
    static class dog {
        public void bark() {
            System.out.println("dpg is barking");
        }
    }
}
public class inner_class {
    public static void main(String[] args) {
        animala onj = new animala();
        // animala.dog obj = onj.new dog();
        // if member is static;
        animala.dog obj = new animala.dog();
        obj.bark();
        onj.talk();
    }
}
