import java.util.ArrayDeque;
public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque list = new ArrayDeque();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.addFirst(4587);
        System.out.println(list);
        list.addLast(87452);
        System.out.println(list);
        list.add("tansihq garg");
        System.out.println(list);

        list.offer("garg");
        System.out.println(list);

        list.offerLast("aggarwall");
        list.offerFirst("vishu garg");
        System.out.println(list);
System.out.println("----------------------");
        ArrayDeque list2 = new ArrayDeque();
        list2.add(list);
        System.out.println(list2);
System.out.println("----------------------");
        list2.add("i love u arushi");
        System.out.println("------------------------");
        System.out.println(list2);
    }
}
