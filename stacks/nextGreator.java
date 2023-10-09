import java.util.Stack;

public class nextGreator {
    public static int[] greator(int [] arr){
        int n=arr.length;
        int []res=new int [n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while ( !st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();    
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
             st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,5,3,2,1,6,3,4};
        int []res=greator(arr);
        for (int i = 0; i<arr.length; i++) {
            System.out.println(res[i]);
        }
    }
    
}
