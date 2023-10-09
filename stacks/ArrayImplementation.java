public class ArrayImplementation {

    public static class Stack{
        int [] arr = new int[5];
        int idx = 0;
        void push(int x){
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){

            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if (idx==0) {
                System.out.println("stack is empty");
                return true;
            }
            return false;
        }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println();
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.display();
        st.push(1);
        
        
    }
}
