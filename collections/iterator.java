import java.util.ArrayList;
import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class iterator {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(600);

        System.out.println(obj);


        // for (int i = 0; i < obj.size(); i++) {
        //     System.out.println(obj.get(i));
        // }

        // for (Object i : obj) {
        //     System.out.println(i);
        // }//there is some problem in the size so it is not recommened to use the loops so we use iterator



        Iterator itr = obj.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());            
        }



        int sum=0;
        int o=0;
        ListIterator itrr = obj.listIterator(obj.size());
        while (itrr.hasPrevious())
        {
            // System.out.println(itrr.previous());            
            sum=(int)itrr.previous();
            o = o+ sum;
            System.out.println(sum);
        }
        // System.out.println(sum);
        System.out.println("the o is "+ o);
    }
    
}
