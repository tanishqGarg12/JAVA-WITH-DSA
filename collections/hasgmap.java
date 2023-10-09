import java.util.*;

public class hasgmap {
    public static void main(String[] args) {
        HashMap obj = new HashMap();

        obj.put(null,"don");
        obj.put(01,"tanishq");
        obj.put(02,"rohit");
        obj.put(03,"raina");
        obj.put(04,"raina");
        obj.put(05,"aruu");

        // duplicates will not be considered';
        // key can be of any type

        System.out.println(obj);



        HashMap obj1 = new HashMap();

        obj1.put("garg1","don");
        obj1.put("garg2","tanishq");
        obj1.put("garg3","rohit");
        obj1.put("garg4","raina");
        obj1.put("garg5","raina");
        obj1.put("garg","aruu");

        System.out.println(obj1);
        // order is not conserved

        LinkedHashMap obj2 = new LinkedHashMap();

        obj2.put("garg1","don");
        obj2.put("garg2","tanishq");
        obj2.put("garg3","rohit");
        obj2.put("garg4","raina");
        obj2.put("garg5","raina");
        obj2.put("aruu","garg");

        System.out.println(obj2);

    }
    
}
