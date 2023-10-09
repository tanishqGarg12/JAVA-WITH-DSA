// package strings;

public class p1 {

    public static void main(String[] args){
        String a="tanishq";
        System.out.println(a);

        String b= new String("tanishq");
        String e= new String("tanishq");
        System.out.println(b);
        System.out.println(e);
        System.out.println(b==e);

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        // String c= a.trim(4);
        // System.out.println(c);
        System.out.println(a==b);
        System.out.println(a.equals(b));

        // StringBuffer c = new StringBuffer("tanishq");
        StringBuilder d= new StringBuilder("dddd");
        StringBuilder g= new StringBuilder("dddd");
        System.out.println(d);
        System.out.println(d==g);
        // System.out.println(a==d);
 
        // System.out.println(a==c);  
        System.out.println(a.concat(" garg"));
        System.out.println(a.toUpperCase());

        for (int i = 0; i < a.length(); i++) {
            System.out.println((char)(a.charAt(i)+5));
        }


        String s1= "tanishq";
        String s3= "tanishq";
        String s4= "tanishq";
        System.out.println(s1+" "+s3+" "+s4);
        System.out.println(s1.substring(1, 6));
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("q"));

        StringBuilder str = new StringBuilder("vishu garg");
        str.append(" aggarwal");
        System.out.println(str);




    }

    
}
