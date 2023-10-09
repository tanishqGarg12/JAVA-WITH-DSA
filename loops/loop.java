// public class loop {
//     public static void main(String[] args) {
//         int a=5,i=0;
//         while (i<a) {
//             System.out.print(i+" ");
//             i++;
            
//         }
//     }
    
// }

// even numners

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a,i=0;

//         Scanner sc= new Scanner(System.in);
//         a=sc.nextInt();
//         while (i<a) {
//             System.out.print(i+" ");
//             i=i+2;
            
//         }
//     }
    
// }

// fibonacci series

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a=0,b=1,i=0,c;
//         // Scanner sc= new Scanner(System.in);
//         // a=sc.nextInt();
//         while (i<40) {
//             // System.out.print(i+" ");
//             // i=i+2;
//             System.out.println(a);
//             c=a+b;
//             a=b;
//             b=c;
//             i++;
//         }
//     }
// }

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a=0,b=1,i=0,c=0,d;
//         Scanner sc= new Scanner(System.in);
//         d=sc.nextInt();
//         while (c<d) {
//             // System.out.print(i+" ");
//             // i=i+2;
//             c=a+b; 
//             b=c;
//             a=b;
//             // i++;
//         }
//         System.out.println(c);
//     }
// }

// sum of numbers


// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int i=0,c=0,d;
//         Scanner sc= new Scanner(System.in);
//         d=sc.nextInt();
//         while (i<=d) {
//             c=c+i;
//             i++;
//         }
//         System.out.println(c);
//     }
// }

// count of a number


// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int i=0,c=0,d;
//         Scanner sc= new Scanner(System.in);
//         d=sc.nextInt();
//         while (d>0) {
//             c=c+1;
//             d=d/10;
//         }
//         System.out.println(c);
//     }
// }

// sum of a digit

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a,c=0,i;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         while (a>0) {
//             i=a%10;
//             c=c+i;
//             a=a/10;
  
//         }
//         System.out.println(c);
//     }
// }

// reverse of a number


// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a,c=0,i;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         while (a>0) {
//             i=a%10;
//             c=c*10+i;
//             a=a/10;
  
//         }
//         System.out.println(c);
//     }
// }

// factorial


// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         int a,c=1,i=1;
//         System.out.println("enter the value");
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         while (a>1) {
//             i=a-1;
//             c=c*i;
//             a=a-1;
            
            
//         }
//         System.out.println(c);
//     }
// }


// factorial

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n,p=1;
//         System.out.println("enter the value of n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         for(int i=1; i<=n;i++){
//             p=p*i;

//         }
//         System.out.println(p);
//     }
// }

// sum of series

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n,p=0;
//         System.out.println("enter the value of n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         for(int i=1; i<=n;i++){
//             if (i%2==0) {
//                 p=p+i;
                
//             }
//             else
//             p=p-i;

//         }
//         System.out.println(p);
//     }
// }

// power

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n,p=1,m;
//         System.out.println("enter the value of m and n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         m= sc.nextInt();
//         for(int i=1; i<=m;i++){
//             p=p*n;
            

//         }
//         System.out.println(p);
//     }
// }

// armstroong number check

// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n,p,m,a=0;
//         System.out.println("enter the value of m and n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         m=n;
//         // m= sc.nextInt();
//         while(n>0){
//             p=n%10;
//             a=a+p*p*p;
//             n=n/10;


//         }

//         if (m==a) {
//             System.out.println("yes it is armstrong "+a);
            
//         }
//         else{
//             System.out.println("it is not armsstong"+a);
//         }
//         // System.out.println(a);
        

//     }
// }

// prime number check
// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n;
//         boolean flag = true;
//         System.out.println("enter the value of m and n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         // m= sc.nextInt();
//         for(int i=2; i<n;i++){
//             if (n%i==0) {
//                 flag= false;

                
//             }
//             // else{
//             //     flag
//             // }

            

//         }

//         if(n==1 || n==2){
//             System.out.println("yes it is prime number "+n);
//         }
//         if(!flag){
//             System.out.println("it is not prime number "+n);
//         }
//         if(flag){
//             System.out.println("the number is prime "+n);
//         }
//         // System.out.println(p);
//     }
// }


// count check


// import java.util.Scanner;

// public class loop
// {
//     public static void main(String[] args) 
//     {
//         int n;
//         char choice;


//         int positive =0;
//         int negatuve=0;
//         int zero =0;
//         // System.out.println("enter the value of m and n");
//         Scanner sc =  new Scanner(System.in);
//         // n= sc.nextInt();
//         do
//         {
//             System.out.println("enter the value");
//             n= sc.nextInt();

//             if (n>0) {
//                 positive++;
                
//             }
//             if (n<0) {
//                 negatuve++;
                
//             }
//             else{
//                 zero++;
//             }

//             System.out.println("do u want to continue y/n");
//             choice= sc.next().charAt(0);



            
//         }while(choice=='y' || choice=='Y');

//         System.out.println("positive "+positive);
//         System.out.println("negative "+negatuve);
//         System.out.println("zero "+zero);
//     }
// }


// // hcf
// import java.util.Scanner;

// public class loop{
//     public static void main(String[] args) {
//         int n,p=1,m;
//         System.out.println("enter the value of m and n");
//         Scanner sc =  new Scanner(System.in);
//         n= sc.nextInt();
//         m= sc.nextInt();
//         for(int i=1; i<=m || i<n;i++){
//             if (n%i==0 && m%i==0) {
//                 // System.out.println(i);
//                 p=i;
                
//             }
            

//         }
//         System.out.println(p);
//     }
// }



import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        int a;
        Scanar sc = new Scaner(System.in);
        a= sc.nextInt();
        for(int i=1; i<10;i++){
            System.out.println("a x i = "+a*i);
        }       
    }
}
