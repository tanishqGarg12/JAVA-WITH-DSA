import org.w3c.dom.Node;
import java.util.*;

public class insertionjava {
   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }


    public static class linkedList{
        Node head= null;
        Node tail= null;


        void insertionAtend(int val){
            Node temp = new Node(val);

            if (head==null) {
                head=temp;
                tail=temp;
            }
            else{

                tail.next=temp;
                tail=temp;
            }

        }

        void displayl(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
                
            }
        }

        int size(){
            Node temp=head;
            int count =0;;
            while (temp!=null) {
                // System.out.println(temp.data);
                count = count+1;;
                temp=temp.next;
                
            }
            return count;
        }


        void insertAtHead(int val){
            Node temp = new Node(val);

            if (head==null) {
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void delete(int val){
            Node temp = head;
            for (int i = 1; i <= val-1; i++) {
                temp=temp.next;
            }
            temp.next = temp.next.next;

            return;
        }


        public void insertMid(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            // if (idx==size()) {
            //     insertionAtEnd(val);
            //     return;
            // }
            if (idx==0) {
                insertAtHead(val);
            }
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            
            
        }

        int getAt(int idx){
            Node temp  =head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

    }
    public static void main(String[] args) {
        linkedList ll =  new linkedList();
        ll.insertionAtend(1);
        ll.insertionAtend(2);
                ll.displayl();
                System.out.println("--------");

        ll.insertionAtend(3);
        ll.insertionAtend(4);
        ll.displayl();
        System.out.println("--------");


        // ll.insertAtHead(78);

        // ll.displayl();
        // System.out.println("-------------");

        // ll.insertMid(1, 453);
        // ll.displayl();
        // System.out.println(ll.size());
        // System.out.println(ll.getAt(2));

        // System.out.println("------------");
        ll.delete(0);
        ll.displayl();

        // ll.insertionAtend(5);
        //  ll.displayl();
        
    }
    
}
