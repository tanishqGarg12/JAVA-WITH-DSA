import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {

    public static void main(String[] args) {
        
        HashSet list =new HashSet();
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        // duplicates are not allowed
        System.out.println(list);


        LinkedHashSet list1 =new LinkedHashSet();

        // LinkedHashSet 
        list1.add(100);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
    }
    
}
