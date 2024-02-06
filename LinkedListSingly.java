public class LinkedListSingly{
    class Node{
        int data;
        Node next;
        public Node(int data){
             this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head =  newnode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
        }
    }
    public void insertAtStart(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
             newnode.next = head;
             head = newnode;
        }
    }

    public void insertAtIndex(int index,int data){
        Node newnode = new Node(data);
       if(index == 0){
       insertAtStart(data);
       }else{
    Node current = head;
    for(int i = 0;i<index-1 && current!= null;i++){
       current = current.next;
    }
    if(current == null){
        System.out.println("Index out of bounds.");
    }

    newnode.next = current.next ;
    current.next = newnode;
     }
    }
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node current = head;
            Node node1 = null;
            for(int i = 0;i<index-1;i++){
                current = current.next;
            }
            node1 = current.next;
            current.next = node1.next;
            node1 = null;
        }

    }
    public void show(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        };
        public static void main(String[] args){
            LinkedListSingly mylist1 = new LinkedListSingly();
            mylist1.insert(11);
            mylist1.insert(55);
            mylist1.insert(66);
            mylist1.insert(77);
            mylist1.insertAtStart(22);
            mylist1.insertAtIndex(0, 10);
            mylist1.insertAtIndex(3, 40);
            mylist1.deleteAt(5);
            mylist1.show();
        }
    }
