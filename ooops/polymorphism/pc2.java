class airplane{
    public void  takeooff(){
        System.out.println("heloo");
    }
    public void  landon(){
        System.out.println("landed");
    }
}
class   jet extends airplane{
    public void  takeooff(){
        System.out.println("jet heloo");
    }
    public void  landon(){
        System.out.println("jet landed");
    }

}
class helicopter extends airplane{
        public void  takeooff(){
        System.out.println("helicopter heloo");
    }
    public void  landon(){
        System.out.println("helicopter landed");
    }
}
class figma extends airplane{
        public void  takeooff(){
        System.out.println("figma heloo");

    }
    public void  landon(){
        System.out.println("figma landed");
    }
}
class airport{
    public void poly(airplane ref){
        ref.takeooff();
        ref.landon();
        System.out.println("|---------------------|");
    }
}
public class pc2 {
    public static void main(String[] args) {
        jet obj = new jet();
        helicopter objj = new helicopter();
        figma objjj = new figma();
        airport object = new airport();
        System.out.println("---------------------");
        object.poly(obj);
        object.poly(objj);
        object.poly(objjj);    
    }
}
