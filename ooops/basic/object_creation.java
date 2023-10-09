package basic;
public class object_creation {
    int a=5;
    String name;
    public static void main(String[] args) {
        //declare varivablr and crete class
        int num=9;//primitive
        object_creation obj = new object_creation();//reference
        object_creation obj2 = new object_creation();//reference
        System.out.println(obj.name);
        System.out.println(obj.a);

        obj2.name="tanishq";
        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
    
}
