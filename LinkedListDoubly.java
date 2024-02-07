public class LinkedListDoubly {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void insertAtBeginning(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

        }
    }
    public void insertAtLast(int data){
        Node newnode = new Node(data);
        if(tail == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    public void insertAtPosition(int index,int data){
        Node newnode = new Node(data);
        if(index == 0){
            insertAtBeginning(data);
        }else{
            Node current = head;
            for(int i = 0;i<index && current != null;i++){
                current = current.next;
            }
            if(current == null){
                insertAtLast(data);
            }else{
                newnode.next = current;
                newnode.prev = current.prev;
                current.prev.next = newnode;
                current.prev = newnode;
            }

        }

    }
    public void deleteAtBeginning(){
        if(head == null){
            return;
        }else if(head == tail){
            head = null;
            tail = null;
            return;
        }else{
            Node current = head;
            head = head.next;
            head.prev = null;
            current.next = null;
        }
    }
    public void deleteAtEnd(){
        if(head == null){
            return;
        }else if(head == tail){
            head = null;
            tail = null;
            return;
        }else{
            Node current = tail;
            tail = tail.prev;
            tail.next = null;
            current.prev = null;
        }
    }
    public void  deleteAtPosition(int index){
        if(head == null){
            return;
        }
        if(index == 0){
            deleteAtBeginning();
        }else {
            Node current= head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                return;
            }if(current == tail){
                deleteAtEnd();
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = null;
            }
           
        }
    }
    public void traverseforward(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ");
    }
    public void traversebackward(){

        Node current = tail;
         while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
         }
         System.out.println(" ");
    }
    public static void main(String[] args){
        LinkedListDoubly mylist2 = new LinkedListDoubly();
        mylist2.insertAtBeginning(10);
        mylist2.insertAtLast(11);
        mylist2.insertAtLast(20);
        mylist2.insertAtLast(25);
        mylist2.insertAtBeginning(7);
        mylist2.insertAtBeginning(5);
        mylist2.insertAtPosition(4, 17);
        mylist2.deleteAtBeginning();
        mylist2.deleteAtEnd();
        mylist2.deleteAtPosition(3);
        mylist2.traverseforward();
        mylist2.traversebackward();
    }
}
