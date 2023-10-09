public class linkedlist{
    
    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        while (head!=null) {
            System.out.println(head.data);
            head=head.next;
            
        }
        System.out.println();
    }
    // static void display(Node head){
    static int length(Node head){
        int count =0;
        while (head!=null) {
            count = count+1;
            head=head.next;
            
        }
        return count;
        // System.out.println();
    }
    // static void display(Node head){
    //     if (head==null) {
    //         return;
    //     }
    //     System.out.println(head.data);
    //     display(head.next);
    // }
    public static void main(String[] args) {
       Node a =new Node(1); 
       Node b =new Node(2); 
       Node c =new Node(3); 
       Node d =new Node(4); 
       Node e=new Node(5); 

       a.next = b;
       b.next = c;  
       c.next = d;
       d.next = e;
    //    Node temp= a;
    //    System.out.println(temp);
    //    temp.next=a;
    //    System.out.println(temp.next);
    //    System.out.println(a);   //linkedlist$Node@28a418fc
    //    System.out.println(a.data);//1
    //    System.out.println(a.next);//linkedlist$Node@5305068a
    //    System.out.println(b);//linkedlist$Node@5305068a

    //    System.out.println(a.data);
    //    System.out.println(a.next.data);
    //    System.out.println(a.next.next.data);
    //    System.out.println(a.next.next.next.data);

    // Node temp=a;
    // for (int i = 0; i < 5; i++) {
    //     System.out.println(temp.data);
    //     temp=temp.next;
    // }
    display(a);
    // System.out.println(length(a));
    // System.out.println();
    // display(a);

    }
}