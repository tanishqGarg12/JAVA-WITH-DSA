import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
// ---------------------------------------------------------
        ArrayList list2 = new ArrayList();
        list2.add(45);
        list2.add("tansihq");
        list2.add('j');
        System.out.println(list2);
// ----------------------------------------------------------------
        ArrayList list3 = new ArrayList();
        list3.addAll(list2);
        System.out.println(list3);
        list3.add(458);
        list3.add("my arushi");
        list3.add(3, "i am billi");
        System.out.println(list3);
// ----------------------------------------------------------------
    }
}
