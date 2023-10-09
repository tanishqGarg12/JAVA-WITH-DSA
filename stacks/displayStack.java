import java.util.*;
public class displayStack {

    // public static void displayReverse(Stack<Integer>s){
    //     if(s.size()==0){
    //         return ;
    //     }
    //     int top=s.pop();
    //     System.out.println(top);
    //     displayReverse(s);
    //     s.push(top);        
    // }
    public static void display(Stack<Integer>s){
        if(s.size()==0){
            return ;
        }
        int top=s.pop();
        display(s);
        System.out.println(top);
        s.push(top);        
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        display(st);
        // System.out.println(st);

        // Stack<Integer> gt= new Stack<Integer>();
        // while (st.size()>0) {
        //     // int x = st.pop();
        //     // System.out.println(x);
        //     gt.push(st.pop());
        // }
        // while (gt.size()>0){
        //     int x = gt.pop();
        //     System.out.println(x);
        //     st.push(x);
        // }

        // int n =st.size();
        // int [] arr=new int[n];
        // for (int i =n-1; i >=0; i--) {
        //     arr[i]=st.pop();
        //     // System.out.println(arr[i]);
        // }
        // System.out.println();
        // for (int i = 0; i <n; i++) {
        //     System.out.println(arr[i]);
        //     st.push(arr[i]);

        // }



    }
}
