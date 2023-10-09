import java.util.Scanner;

public class array5 {

    static void printarray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void swap(int [] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort(int [] arr,int a){
        int zeros=0;
        for (int i = 0; i < arr.length; i++)
         {
            if (arr[i]==0) 
            {
                zeros++;   
            }

        }

        for (int j = 0; j < arr.length; j++) {
            if (j<zeros) 
            {
                arr[j]=0;
                
            }
            else{
                arr[j]=1;
            }
        }
    }


    static void swaparaay(int [] arr,int n){
        int left=0;
        int right = n-1;
        while (left<right) {
            if (arr[left]>0 && arr[right]<0) {
                swap(arr,left,right);
                left++;
                right--;
                
            }
            if (arr[left]<0) {
                left++;
                
            }
            if (arr[right]>0) {
                right--;
                
            }
            
        }

    }


    static void swaparaayoddeven(int [] arr,int n){
        int left=0;
        int right = n-1;
        while (left<right) {
            if (arr[left]%2!=0 && arr[right]%2==0) {
                swap(arr,left,right);
                left++;
                right--;
                
            }
            if (arr[left]%2==0) {
                left++;
                
            }
            if (arr[right]%2!=0) {
                right--;
                
            }
            
        }

    }


    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // System.out.println("========");
        printarray(arr);
        sort(arr, n);
        // swaparaay(arr, n);
        System.out.println("==============");
        printarray(arr);

        // swaparaayoddeven(arr, n);
        // System.out.println("=========");
        // printarray(arr);

    }
    
}
