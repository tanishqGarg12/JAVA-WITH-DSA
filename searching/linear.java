import java.util.*;
public class linear {
    static void search(int []arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        search(arr,3);
    }
    
}
