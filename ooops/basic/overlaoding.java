package basic;
// package ooops;


class calc{
    public int add(int n1,int n2){
        int result = n1+n2;
        return result;
    }
    public int add(int n1,int n2,int n3){
        int result = n1+n2+n3;
        return result;
    }
    public Double add(Double n1,Double n2,Double n3){
        Double result = n1+n2+n3;
        return result;
    }

}

public class overlaoding {
    String name = "tanishq";
    public static void main(String[] args) {
        calc ac = new calc();
        overlaoding obj = new overlaoding();
        System.out.println(obj.name);
        int resukt = ac.add(1,2);
        System.out.println(resukt);
        System.out.println(ac.add(1,2,3));

    }
    
}
