import javax.sound.sampled.SourceDataLine;

class arrayy{

    void demoarray(){


        int ar[]={1,2,3};
        System.out.println(ar[1]);
        
        System.out.print(ar[0]+" "+ ar[1]+" "+ar[2]+" ");
        System.out.println();
        System.out.println("-------------------------");


        int [] br = new int[3];
        br[0]=5;
        br[1]=2;
        br[2]=3;


        // br[3]=4;
        System.out.println(br[0]);
        System.out.println(br[1]);
        System.out.println(br[2]);

        System.out.println("-------------------------");

        double [] decimal = new double[5];
        decimal[0]=1.1;
        decimal[1]=1.2;
        decimal[2]=1.45;
        decimal[3]=1.21;
        System.out.println(decimal[0]);
        System.out.println(decimal[1]);
        System.out.println(decimal[2]);
        System.out.println(decimal[0]+decimal[1]+decimal[2]+" sum");

        System.out.println("----------------------");



        // System.out.println("-----------------");
    }

    void loops(){
        // int arr[] = new int[5];
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
        System.out.println();
        System.out.println("------------------");


        // for each loops start with i=1
        for (int i : arr) {
            System.out.println(arr[i-1]);
            
        }

 


    }






}


class question{
    void maximum(){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,15};
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>a) {
                a=arr[i];
                
            }
            
        }
        System.out.println("maximum is "+a);


    }


    void sum(){
        int arr[]={1,2,3,4,5};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {

            sum=sum+arr[i];
            
        }
        System.out.println("sum is "+sum);
    }


    void searching(){
        int arr[]={1,2,3,4,5,67,8,9};
        int x=15;
        int y=0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                y=i;
                flag=true;


                
            }
        }
        if (flag) {
            System.out.println("yes it is found at index "+y);
            
        }
        else{
            System.out.println("not found");
        }
    }
}


public class array{
    public static void main(String[] args) {
        arrayy obj = new arrayy();
        question objj = new question();
        obj.demoarray();
        obj.loops();
        System.out.println("-------------");


        // questions
        objj.maximum();
        System.out.println("---------------------");
        objj.sum();
        System.out.println("---------------------");
        objj.searching();


        // int brrr[]={1,2,3,4,5};
        // System.out.println(brrr[1]);

    }
}