// package test;
import java.util.Scanner;


public class array {

    static void unique(int arr[]){
        int [] ans = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=arr[j]=-1;
                    
                }
                
            }
            if (arr[i]>0) {
                ans[k++]=arr[i];
                
                
            }
        }
        System.out.println();
        // System.out.println(896);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }




    static void count(int [] arr){
        Scanner sc = new Scanner(System.in);

        int c=0;
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                c=i;
                
            }
        }
        System.out.println("the last occurance is"+c);




    }



    static void nogreator(int [] arr){
        Scanner sc = new Scanner(System.in);

        int c=0;
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>n) {
                c++;
                
            }
        }
        System.out.println("the count is"+c);




    }


    static void sort(int [] arr){
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                flag=false;
                break;
                
            }
        }

        if (flag) {
            System.out.println("sorted");
            
        }
        else{
            System.out.println("not sorted");
        }
    }


    static int[] prefixsum(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;



    }

    static int[] freqarray(int [] arr){
        int [] freq = new int[arr.length];
        for (int i = 0; i < 4; i++) {
            freq[arr[i]]++;
        }
        return freq;

    }

    static void swap(int [] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static void sortevenodd(int [] arr){
        int n = arr.length;
        int left=0;
        int right = n-1;
        System.out.println();

        while(left<right) {
            if (arr[left]%2!=0 && arr[right]==0) {
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

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }


    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter thr sixe of an array");
        n=sc.nextInt();
        
        int [] arrr= new int[n];
        System.out.println("enter the element of array");

        for (int i = 0; i <n; i++) {
            arrr[i]=sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arrr[i]+" ");
        }

        // unique(arrr);
        count(arrr);
        // nogreator(arrr);
        // sort(arrr);
        // int [] p=prefixsum(arrr);
        // int []p=freqarray(arrr);
        // sortevenodd(arrr);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arrr[i]+" ");
        // }





        // int q;
        // System.out.println("enter thr value of q");
        // q=sc.nextInt();
        // while (q>0) {
        //     // int l=0,u=0;
        //     // System.out.println("enter the values of l and u");
        //     // l=sc.nextInt();
        //     // u=sc.nextInt();
        //     // int sum=0;
        //     // sum=p[u]-p[l-1];
        //     // System.out.println(sum);
        //     // q--;
        //     int x;
        //     System.out.println("enter the value of x");
        //     x=sc.nextInt();
        //     if (p[q]==x) {
        //         System.out.println("yes");

                
        //     }
        //     else{
        //         System.out.println("no");
        //     }

        //     q--;
        // }






        
    }
    
}
