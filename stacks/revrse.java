import java.util.Stack;

public class revrse {

    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void display(Stack <Integer>st){
        if(st.size()==1){
            return ;
        }
        int top = st.pop();
        display(st);
        pushAtBottom(st,top);
        // st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        display(st);
        System.out.println(st);
    }
    
}
