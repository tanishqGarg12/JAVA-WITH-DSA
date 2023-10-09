import java.util.Hashtable;
import java.util.TreeMap;
import java.util.*;

public class hashtable {
    public static void main(String[] args) {
        
        Hashtable obj = new Hashtable();

        obj.put(01, "tanishq");
        obj.put(02, "aruu");
        obj.put(03, "garg");

        obj.putIfAbsent(02, "aruu");

        System.out.println(obj);
        System.out.println(obj.keySet());

        // threads safe
        // hashmap is not threads safe means multiple value can run ata same time
        // null value is not allowd;


        // TreeMap objj = new TreeMap();
        // ordr is in sorted here
        // all the method s are apploied 
        // like keyset keyvalue;



    }
}
