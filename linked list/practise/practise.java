public class practise {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedList{
        
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void delete(int idx){
            // head=null;
            Node temp = head;
            for (int i = 0; i <idx; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return;
        }
        // void insertAtbeg(int val){
        //     Node temp= new Node(val);
        //     if(head==null){
        //         head=temp;
        //         tail=temp;
        //     }
        //     else{
        //         temp.next=head;
        //         head=temp;
        //     }
        // }
        // void insertAtmid(int val){
        //     Node temp= new Node(val);
        //     if(head==null){
        //         head=temp;
        //         tail=temp;
        //     }
        //     else{
        //         temp.next=head;
        //         head=temp;
        //     }
        // }


    //     void insertAtMid(int val,int idx){
    //         Node t= new Node(val);
    //         Node temp=head;
    //         for (int i = 0; i < idx; i++) {
    //             temp=temp.next;
    //         }
    //         t.next=temp.next;
    //         temp.next=t;
    //     }
        void display(){
            // head=null;
            Node temp=head;
            while (temp!=null) 
            {
                System.out.println(temp.data);   
                temp=temp.next;         
            }
    }
        
}
    // static void display(Node temp){
    //     while (temp!=null) {
    //         System.out.println(temp.data);   
    //         temp=temp.next;         
    //     }
    // }
    // static int display(Node temp){
    //     int c=0;
    //     while (temp!=null) {
    //         // System.out.println(temp.data);  
    //         c=c+1;
    //         temp=temp.next;

    //     }
    //     return c;
    // }
    
    // static void display(Node temp){
    //     while (temp!=null) {
    //         // System.out.println(temp);
    //         // System.out.println(temp.next);
    //         System.out.println("the value is "+temp.data);   
    //         temp=temp.next;         
    //     }
    // }
    // static void  display(Node temp){
    //     if(temp==null){
    //         return;
    //     }
    //     display(temp.next);
    //     System.out.println(temp.data);
    // }


    public static void main(String[] args) {
        // Node a = new Node(1);
        // Node b = new Node(2);
        // Node c = new Node(3);
        // Node d = new Node(4);
        // Node e = new Node(5);
        
        // a.next=b;
        // b.next=c;
        // c.next=d;
        // d.next=e;
        // e.next=null;
        // System.out.println(a);
        // System.out.println(a.next);
        // System.out.println(b);
        // display(a);
        // int length=display(a);
        // System.out.println(length);

        linkedList a = new linkedList();
        a.insertAtEnd(1);
        a.insertAtEnd(2);
        a.insertAtEnd(3);
        a.display();
        // a.insertAtbeg(1);
        // a.insertAtbeg(2);
        // a.insertAtbeg(3);
        // a.insertAtMid(55, 1);
        a.delete(2);
        a.display();
    }
}
