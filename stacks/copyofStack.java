// package stacks;
import java.util.*;

public class copyofStack {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int x=0;

        // for (int i = 0; i < 4; i++) {
        //     x=sc.nextInt();
        //     st.push(x);

            
        // }
        // System.out.println(st);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0) {
            gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);
        
    }
    
}


