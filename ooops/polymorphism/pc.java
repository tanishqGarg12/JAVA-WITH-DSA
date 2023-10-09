class airplane {
    public void takeooff() {
        System.out.println("heloo");
    }

    public void landon() {
        System.out.println("landed");

    }
}

class jet extends airplane {
    public void takeooff() {
        System.out.println("jet heloo");

    }

    public void landon() {
        System.out.println("jet landed");

    }

}

class helicopter extends airplane {
    public void takeooff() {
        System.out.println("helicopter heloo");

    }

    public void landon() {
        System.out.println("helicopter landed");

    }
}

class figma extends airplane {

    public void takeooff() {
        System.out.println("figma heloo");

    }

    public void landon() {
        System.out.println("figma landed");

    }
}

public class pc {
    public static void main(String[] args) {

        jet obj = new jet();
        // obj.takeooff();
        // obj.landon();
        helicopter objj = new helicopter();
        // objj.takeooff();
        // objj.landon();
        figma objjj = new figma();
        // objjj.takeooff();
        // objjj.landon();

        airplane ref;
        ref = obj;
        ref.takeooff();
        ref.landon();
        ref = objj;
        ref.takeooff();
        ref.landon();

    }

}
