import java.util.Scanner;


class question
{
    // int swapping()
    // {
    //     // int [] arr = new int[a];
    //     System.out.println("enter elements of array");
    //     int c,b;
    //     Scanner sc= new Scanner(System.in);
    //     c=sc.nextInt();
    //     b=sc.nextInt();
    //     System.out.println(c+"  "+b);
    //     int d = c;
    //     c=b;
    //     b=d;
    //     System.out.println(c+"  "+b);
    //     return 1;

    // another method 
    // a=a+b
    // b=a-b
    // a=a-b;   
     // }







}


public class array4 
{

    static void swap(int [] arr , int a,int b){
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void reverse(int [] arr,int a,int b)
    // static int[] reverse(int [] arr,int a)
    {

        // method 1
        // int[]brr = new int[a];
        // int j=0;
        // for (int i = a-1; i >= 0; i--) {
        //     brr[j++]=arr[i];
        // }


        // method2
        for (int i = a,j=b; i < j; i++,j--) {
            swap(arr, i, j);
            
            
        }
        // return 1;

    }

    static void rotate(int []arr,int k,int n){
        k=k%n;
        int [] brrr =new int[n];
        int j=0;
        for (int i = n-k; i <= n-1; i++) {
            brrr[j++]=arr[i];
            
        }
        for (int i = 0; i <= n-k-1; i++) {
            brrr[j++]=arr[i];
        }
        System.out.println("-------------");

        for (int i = 0; i < brrr.length; i++) {
            System.out.println(brrr[i]);
        }
    }



    static void rotateInPlace(int []arr,int k,int n)
    {
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        System.out.println("=============");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }


    }


    static int [] makeFrequencyArrayint(int [] arr,int n){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;


        }    
        return freq;
    }







    public static void main(String[] args) 
    {
        int n,k;
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // System.out.println("enter hoe many times u want to rotate");
        // k=sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("-----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // reverse(arr, n);

        // rotate(arr, k, n);
        // rotateInPlace(arr, k, n);
        System.out.println("-----------------");

        int [] freq=makeFrequencyArrayint(arr,n);
        int q;
        System.out.println("enter the number of quesries");
        q=sc.nextInt();
        while (q>0) {
            int x;
            System.out.println("enter the value of x");
            x=sc.nextInt();
            if (freq[x]>0) {
                System.out.println("yes");
                
            }
            else{
                System.out.println("no");
            }
            q--;
            
        }


        // System.out.println(brr);
        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }
        question obj = new question();





        // obj.swapping();
    }
    
}
