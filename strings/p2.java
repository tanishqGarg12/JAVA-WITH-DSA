public class p2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("tanishq garg");
        // StringBuilder str1 = new StringBuilder("tanishq garg");
        // deaflut=16
        System.out.println(str.capacity());

        StringBuffer str1= new StringBuffer();
        System.out.println(str1.capacity());
        str1.append("aaaaaaaaaaaaaaaa");
        System.out.println(str1.capacity());
        str1.append("a");
        System.out.println(str1.capacity());
        // .lenght()-->to get length of strings

        str.setCharAt(1,'A');
        System.out.println(str);

                // StringBuilder str = new StringBuilder(150);capacity

    StringBuilder sb=new StringBuilder(150);
    System.out.println(sb.capacity());
    sb.append("java");
    System.out.println(sb);
    sb.trimToSize();
    System.out.println(sb.capacity());

    
    StringBuilder sb=new StringBuilder("pwjava");
    System.out.println(sb);
    System.out.println(sb.reverse());






        
    }
    
}
