// package dubly_linkedlist;

public class list {
    public static class Node{
        int val;
        Node next;//null
        Node prev;//null
        Node(int val){
            this.val=val;
        }

    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp=random;
        while (temp.prev!=null) {
            
            temp=temp.prev;
        }
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node insertAtHaed(Node head,int x){
        Node t = new Node(30);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtIdx(Node head,int idx,int x){
        Node s = head;
        for (int i = 0; i < idx-1; i++) {
            s=s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void insertAttail(Node head,int x){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;  
        }
        Node t = new Node(x);
        temp.next=t;
        t.prev=temp;
    }

    public static void main(String[] args) {
        Node a =new Node(4);
        Node b =new Node(10);
        Node c =new Node(2);
        Node d =new Node(7);
        Node e =new Node(98);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        // display2(e);
        // displayRandom(c);
        // Node newhaed = insertAtHaed(a, 84);
        // display(newhaed); 
        // insertAttail(e, 90);
        insertAtIdx(a, 3, 789);
        display(a);


    }
    
}
