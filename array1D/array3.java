import java.util.Scanner;

import javax.xml.transform.Source;

class araayy{

    // double pair
    int basic (int a){
        int [] arr = new int[a];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x=5;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x) {
                    c++;
                    System.out.println(arr[i]+"  "+ arr[j]);
                    
                }
            }
        }
        System.out.println("the total number of pairs are "+c);
        
        return 1;




    }



    // triple pair
    void basic2(int a)
    {
         int [] arr = new int[a];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x=16;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if (arr[i]+arr[j]+arr[j2]==x) {
                        c++;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[j2]);
                        
                    }
                }
                    
                }
            }
            System.out.println("the total number of pairs are "+c);
        }
       
        // int [] arr = new int[n];



    // unique number
    void basic3(int a){
        int [] arr = new int[a];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------");
        // int x=5;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]= arr[j]= -1;
                    
                }
            }
            if (arr[i]>0) {
                c++;
                // break;
                
            }
            
        }
        System.out.println("the unique numbers is "+c);
        // System.out.println("the total number of pairs are "+c);
       
    }



    //second maximum
    void basic4(int a){
        int [] arr = new int[a];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                
                max=arr[i]; 
            }
        }

        System.out.println("the max is "+max);
        c=max;
        int smax=-9;
        for (int i = 0; i < arr.length; i++) {
            if (smax<arr[i] && arr[i]!=max) {
                smax=arr[i];
                // c=arr[i];
                System.out.print(arr[i]+" ");

                
            }
        }
        System.out.println();
        System.out.println("the second max number is "+smax);
       

    }
        
}





public class array3 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // int [] obj = new int[n];
        araayy obj= new araayy();
        // obj.basic(n);
        // obj.basic2(n);
        obj.basic3(n);
        // obj.basic4(n);

    }
    
}
