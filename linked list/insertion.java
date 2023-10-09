class insertion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertionAtEnd(int newData){
        Node newNode = new Node(newData);

        if (head==null) {
            head = new Node(newData);
            return;
        }// if linked list is not empty

        newNode.next=null;
        Node temp  = head;
        while (temp.next!=null) {
            temp=temp.next;
        }

        temp.next=newNode;
        return;
    }

    public void displayll(){
        Node current = head;

        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }

    }


    


    public static void main(String[] args) {

        insertion llist = new insertion();
        llist.insertionAtEnd(1);
        llist.insertionAtEnd(2);
        llist.insertionAtEnd(3);
        llist.displayll();
        System.out.println();

        llist.insertionAtEnd(4);
        llist.displayll();
        
    }






    
}
