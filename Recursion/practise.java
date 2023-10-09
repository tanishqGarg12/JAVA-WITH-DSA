import java.util.*;

public class practise {


    // static void natural(int x){
    //     if (x==1) {
    //         System.out.println(x);
    //         return;
    //     }
    //     System.out.println(x);
    //     natural(x-1);
    //     // System.out.println(x);

    // }
    // static int factorial(int x){
    //     if (x==1) {
    //         // System.out.println(x);
    //         return x;
    //     }
    //     return x*factorial(x-1);

    // }
    // static int fibbonacci(int x){
    //     if (x==0|| x==1) {
    //         // System.out.println(x);
    //         return x;
    //     }
    //     return fibbonacci(x-1)+fibbonacci(x-2);

    // }
    // static int sumoddigists(int x){
    //     if (x<10) {
    //         return x;
    //     }
    //     return x%10+sumoddigists(x/10);

    // }
    static int power(int x,int y){
        if (y==0) {
            return 1;
        }
        return x*power(x, y-1);

    }
    // static int power1(int x,int y){
    //     if (y==1) {
    //         return 1;
    //     }
    //     int result = power(x, y/2);
    //     int final_result = result*result;
    //     if (y%2==0) {
    //         return final_result;
    //     }
    //     else{
    //         return x*final_result;
    //     }
        

    // }
    // static void multiple(int x,int y){
    //     if (y==1) {
    //         System.out.println(x);
    //         return ;
    //     }
    //     multiple(x, y-1);
    //     System.out.println(x*y);

        
        

    // }
    // static int alternate(int x){
    //     if (x==0) {
    //         // System.out.println(x);
    //         return x;
    //     }
    //     // int sum = 0;
    //     if (x%2==0) {
    //         return alternate(x-1)-x;
    //     }
    //     else{

    //         return alternate(x-1)+x;
    //     }
    //     // return alternate(x);
    // }
    // static int hcf(int x,int y){
    //     if (y==0) {
    //         return x;
    //     }
    //     // time complexity log(max(x,y))
    //     return hcf(y, x%y);
    // }


    // static void printa(int [] arr,int idx){
    //     if (idx>=arr.length) {
    //         return;
    //     }
    //     System.out.println(arr[idx]);
    //     printa(arr, idx+1);
    // }
    // static int maxa(int [] arr,int idx){
    //     if (idx==arr.length-1) {
    //         return arr[idx];
    //     }
    //     int small=maxa(arr, idx+1);
    //     return Math.max(small, arr[idx]);
    // }
    // static int suma(int [] arr,int idx){
    //     if (idx==arr.length-1) {
    //         return arr[idx];
    //     }
    //     int small=suma(arr, idx+1);
    //     return small + arr[idx];
    // }


    // static void search(int [] arr,int idx,int x){
    //     if (idx>=arr.length) {
    //         // System.out.println(idx);
    //         return;
    //     }
    //     if (arr[idx]==x) {
    //         System.out.println(idx);
    //     }
    //     search(arr, idx+1, x);
    // }


    // static ArrayList<Integer> search(int [] arr,int idx,int x){
    //     ArrayList ans = new ArrayList<Integer>();
    //     if (idx>=arr.length) {
    //         return new ArrayList<Integer>();
    //     }
    //     if (arr[idx]==x) {
    //         ans.add(idx);
    //     }
    //     ArrayList smallans = search(arr, idx+1, x);
    //     ans.addAll(smallans);

    //     return ans; 
    // }

    // static void prints(String s,int idx){
    //     if (idx>=s.length()) {
    //         return;
    //     }
    //     System.out.print(s.charAt(idx));
    //     prints(s, idx+1);
    // }
    
    // static void prints(String s,int idx){
    //     if (idx>=s.length()) {
    //         return;
    //     }
    //     System.out.print(s.charAt(idx));
    //     prints(s, idx+1);
    // }

    // static String prints(String s,int idx,char c){
    //     String small="";
    //     if (idx>=s.length()) {
    //         return "";
    //     }
    //     if (s.charAt(idx)!=c) {
    //         return small+s.charAt(idx)+prints(s, idx+1, c);
    //     }
    //     if (s.charAt(idx)==c) {
    //         return small+prints(s, idx+1, c);  
    //     }
    //     return small;
    // }

    // static Boolean prints(String s,int r,int l )
    // {
    //     if (r>l) {
    //         return true;
            
    //     }
    //     return s.charAt(r)==s.charAt(l)&& prints(s, r+1, l-1);
    // }


    // static ArrayList<String> prints(String s){
    //     ArrayList ans = new ArrayList<String>();
    //     if (s.length()==0) {
    //         ans.add("");
    //         return ans;
    //     }
        
    //     char current = s.charAt(0);
    //     ArrayList<String> smallans = prints(s.substring(1));
    //     for (String i : smallans) {
    //         ans.add(i);
    //         ans.add(current+i);
    //     }
    //     return ans;
    // }
    
    // static ArrayList<String> prints(String s){
    //     ArrayList ans = new ArrayList<String>();
    //     if (s.length()==0) {
    //         ans.add("");
    //         return ans;
    //     }
        
    //     char current = s.charAt(0);
    //     ArrayList<String> smallans = prints(s.substring(1));
    //     for (String i : smallans) {
    //         ans.add(i);
    //         ans.add(current+i);
    //     }
    //     return ans;
    // }

    // static void sum(int [] arr,int idx,int sum){
    //     if (idx>=arr.length-1) {
    //         System.out.println(sum); 
    //         return;           
    //     }
    //     int current = arr[0];
    //     sum(arr, idx+1, sum+current);
    //     sum(arr, idx+1, sum);
    // }

    static int [] (int arr,int idx ){
        
    }


    public static void main(String[] args) {
        // int n;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("eneter the value of n");
        // n=sc.nextInt();
        // natural(n);
        // int x = fibbonacci(n);

        // for (int i = 0; i < n; i++) {
        //     int y = fibbonacci(i);
        //     System.out.println(y);
        // }
        // System.out.println("the factorial of is "+x);

        // int y=sumoddigists(n);
        // System.out.println(y);

        // int y = power1(2, 4);
        // System.out.println(y);
        // multiple(2, 5);
        // int m =alternate(4`);
        // System.out.println(m);

        // int t = hcf(24, 15);
        // System.out.println("the hcf is "+ t);

        // int[] arr={1,2,3,4,5,1,2,1,4,5,1};
        // printa(arr, 0);


        // int t= suma(arr, 0);
        // System.out.println("the sum is "+t);

        // ArrayList ww=search(arr, 0, 1);
        // System.out.println(ww);
        // System.out.println("the no is at "+t);

        // String s="abc";
        // String ss=prints(s, 0,'a');
        // System.out.println(ss);
        // ArrayList<String> ss= prints(s);
        // System.out.println(ss);

        // int []arr={1,2,3,4};
        // sum(arr, 0, 0);


        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        x=sc.nextInt();

        int y  = (int)Math.pow(x, 0.5);
        System.out.println(y);
        int [] arr = new int[2];
        if (x%y==0) {
            arr[0]=y;
            arr[1]=y;
            
        }
        // System.out.println(arr);   
        for (int i : arr) {
            System.out.println(i);
        } 

        else{

        }
        return;


    }
    
}
