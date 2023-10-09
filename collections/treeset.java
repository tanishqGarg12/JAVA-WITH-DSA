import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
    TreeSet obj  = new TreeSet();
    obj.add(458);
    obj.add(48);
    obj.add(4598);
    obj.add(458552);
    obj.add(45812224);
    obj.add(458888);

    System.out.println(obj);
    //sorted order answerr


    System.out.println(obj.lower(4598));
    System.out.println(obj.higher(458));


    System.out.println(obj.ceiling(4589));
    System.out.println(obj.floor(458));
}
    
}
