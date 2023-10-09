import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        System.out.println(st.isEmpty());
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("the size is "+st.size());
        st.push(45);
        st.push(78);
        st.push(789);
        System.out.println("the size is "+st.size());

        st.push(4521);
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("the size is "+st.size());
        
    }
    
}
