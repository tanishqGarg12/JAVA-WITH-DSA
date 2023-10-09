import java.util.Arrays;

public class arraypractise {

    static void swap(int [] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        // return ;
    }

    static void reverse(int [] arr,int a,int b){
        int n=arr.length;

        for (int i = a,j=b; i < j; i++,j--) {

            swap(arr, i, j);
            
        }


        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
    }
    





    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,5,10,100};


        reverse(arr, 0, arr.length-1);


        // for (int i = 1; i < arr.length-1; i++) {
            //     if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
        //         System.out.println(arr[i]);
        //     }
        // }


        // boolean flag = false;
        // for (int i = 0; i < brr.length; i++) {
        //     if (arr[i]==brr[i]) {
        //         // System.out.println("yes");
        //         // break;
        //         flag=true;
        //     }
        //     else{
        //         flag=false;
        //     }
        // }
        // if (flag==true) {
        //     System.out.println("yes");
        // }
        // else{System.out.println("no");}

        // int q=3;
        // // System.out.println("enter the number of queries");
        // while (q>0) {
            //     int n=1000;
            //     int c=-1;

        //     for (int i = 0; i < brr.length; i++) {
        //         if (n>brr[i]) {
        //             n=brr[i];
        //             c=i;
        //         }

        //     }
        //     q--; 
        //     brr[c]=785;
        //     System.out.println(n+" ");
        // }
        

        // subarray
        // int crr[]=Arrays.copyOfRange(brr,0,4);
        // // System.out.println(crr);
        // for (int i = 0; i < crr.length; i++) {
        //     System.out.println(crr[i]);
        // }


        // int brr[]={1,2,3,7,5};
        // int sum =0;
        // for (int i = 0; i < brr.length; i++) {
        //     int [] crr= Arrays.copyOfRange(brr, i, brr.length);
        //     sum=0;
        //     for (int j = 0; j < crr.length; j++) {
        //         // System.out.print(crr[j]+" ");
        //         sum=sum+crr[j];
        //         // System.out.println("sum  "+sum);
        //         if (sum==12) {
        //             System.out.println("hh================");
        //             System.out.println(i+"h "+(crr.length-1));
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }



    }
}
