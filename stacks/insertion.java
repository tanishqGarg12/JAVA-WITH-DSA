// package stacks;
import java.util.*;

import java.util.Stack;

public class insertion {
    
        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            System.out.println(st);
            Stack<Integer> gt = new Stack<>();
            int x=45;
            int idx = 2;
            while (st.size()>idx) {
                gt.push(st.pop());
            }
            st.push(x);
            System.out.println(gt);

            while(gt.size()>0){
                st.push(gt.pop());
            }
            System.out.println(st);
            System.out.println(gt);
        }
    
}
