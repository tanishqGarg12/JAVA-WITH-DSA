// import java.util.Stack;

public class LinekdListImplementation {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size=0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head= temp;
            size++;
        } 
        int pop(){
            if(head==null){
                System.out.println("head is empty");
                return -1;
            }
            int x = head.val;
            head=head.next;
            return x; 
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            return head.val;
        }
        void dispaly(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0)return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.dispaly();
        st.pop();
        st.pop();
        st.dispaly();
        System.out.println(st.peek());
        st.push(23);
        st.push(236);
        st.push(2397);
        System.out.println("--------------");
        st.dispaly();
    } 
}
