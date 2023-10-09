import java.util.*;
public class inserstionMid {
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


    }
    public static void main(String[] args) {
        linkedList ll =  new linkedList();
        ll.displayl();
        System.out.println("--------");


        ll.displayl();
        System.out.println("-------------");

        ll.insertMid(1, 453);
        ll.displayl();
    }
    
}

    

