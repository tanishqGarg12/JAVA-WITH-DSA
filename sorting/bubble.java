import java.util.*;
public class bubble 
{
    static void sort(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            Boolean swap = false;
            for (int j = 0; j < arr.length-1-i; j++) 
            {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap  = true;
                }
            }
            if (!swap) 
            {
                break;           
            }
        }
    }
    public static void main(String[] args) 
    {
        int [] arr={9,4,5,2,1,78};
        sort(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}