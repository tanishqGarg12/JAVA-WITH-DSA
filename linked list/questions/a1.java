// package questions;

public class a1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    } 

    public static void display(Node a){
        Node temp = a;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
// Q1-->findinh nth node from the end of linked list
    // public static Node  endOfLink(Node head,int n){
    //     int size=0;
    //     Node temp = head;
    //     while (temp!=null) {
    //         temp=temp.next;
    //         size++;
    //     }
    //     int m =size-n+1;
    //     temp=head;
    //     for (int i = 1; i <=m-1; i++) {
    //         temp=temp.next;
    //     }
    //     return temp;
    // }       
    // public static Node  endOfLink(Node head,int n){
    //     int size=0;
    //     Node fast=head;
    //     Node slow=head;
    //     for (int i = 1; i <=n; i++) {
    //         fast=fast.next;
    //     }
    //     while (fast!=null) {
    //         slow=slow.next;
    //         fast=fast.next;
    //     }
    //     return slow;
    // }   
    
    // delete node from last
    // public static Node  delete(Node head,int n){
    //     int size=0;
    //     Node fast=head;
    //     Node slow=head;
    //     for (int i = 1; i <=n; i++) {
    //         fast=fast.next;
    //     }
    //     if (fast==null) {
    //         head=head.next;
    //         return head;
    //     }
    //     while (fast.next!=null) {
    //         slow=slow.next;
    //         fast=fast.next;
    //     }
    //     slow.next=slow.next.next;
    //     return head;
    // }       


     public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // endOfLink(a, 2);
        System.out.println(endOfLink(a,2).data);
        // display(a);
        // System.out.println(endOfLink(a, 2));
        // a=delete(a, 5);
        // display(a);



        
     }
    
}
