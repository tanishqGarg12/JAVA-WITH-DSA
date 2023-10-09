
//taking input

// import java.util.Scanner;

// public class array2 {
//     public static void main(String[] args) {
//         int n;
//         System.out.println("enter the size of array");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         int [] arr = new int[n];
//         for (int i = 0; i <n; i++) {
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("--------------");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }

    
// }


//copy of an array

// import java.util.Scanner;

// public class array2{
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         int [] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("-----------");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         int [] arr2 = new int[n];
//         arr2 =arr;
//         System.out.println("---------- coppied array");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.println(arr2[i]);
//         }

//     }
// }

//copy of array wwith manipulation --->shallow copy


// import java.util.Scanner;

// public class array2{
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         int [] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("-----------");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         int [] arr2 = new int[n];
//         arr2 =arr;
//         arr2[1]=0;
//         arr2[2]=0;
//         System.out.println("---------- coppied array");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.println(arr2[i]);
//         }

//         System.out.println("arr1");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         // so in java it is only pass by value if we pass primitive value its value would not get change
//         // but in case of array due heap memory locaation copy is made but on same memory location due to this 
//         // parent array is also changed

//     }
// }

// deep copy--->clone--->here original array is not changed




//method of copy array
//.copyof(arr,start index,exclusive ended index)


//count of a particular element

// import java.util.Scanner;

// public class array2{
//     public static void main(String[] args) {
//         int n;
//         int c=0;
//         System.out.println("enter the number");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         System.out.println("enter the array");
//         int [] arr = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("----------- print the array");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==n) {
//                 c++;

                
//             }
//         }

//         System.out.println("the count of the element if "+c);


//     }
// }




//last occurance

// import java.util.Scanner;

// public class array2{
//     public static void main(String[] args) {
//         int n;
//         int c=0;
//         System.out.println("enter the number");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         System.out.println("enter the array");
//         int [] arr = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("----------- print the array");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==n) {
//                 c=i;
//             }
//         }
//         System.out.println();
//         System.out.println("the last occurance of the element if "+c);
//     }
// }





//number greator then the particular number
// import java.util.Scanner;

// public class array2{
//     public static void main(String[] args) {
//         int n;
//         int c=0;
//         System.out.println("enter the number");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         System.out.println("enter the array");
//         int [] arr = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("----------- print the array");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]>n) {
//                 c++;              
//             }
//         }
//         System.out.println();
//         System.out.println("the greator number is "+c);
//     }
// }




// sort check
// import java.util.Scanner;
// public class array2{
//     public static void main(String[] args) {
//         int n;
//         boolean flag = true ;
//         int c=0;
//         // System.out.println("enter the number");
//         Scanner sc = new Scanner(System.in);
//         // n = sc.nextInt();
//         System.out.println("enter the array");
//         int [] arr = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("----------- print the array");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i]<arr[i-1]) {
//                 flag = false;               
//             }
//         }
//         System.out.println();
//         if (flag) {
//             System.out.println("sorted");
//         }
//         else{
//             System.out.println("not sorted");
//         }
//     }
// }




//.sort is udes to sort the array