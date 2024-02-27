class Queue{
    int capacity = 5;
    int[] queue = new int[capacity];
    int size = 0;
    int front = 0;
    int rear = 0;
Queue(){

}
public void enqueue(int data){
    if(!queueisFull()){
    queue[rear] = data;
    rear = (rear+1)%capacity;
    size++;
}else{
    System.out.println("Queue is full.Cannot Enqueue.");
}
}
public void show(){
    System.out.println("Elements: ");
    for(int i = 0;i<size;i++){
        System.out.print(queue[(i+front)%capacity]+ " ");
    }
    System.out.println(" ");
    System.out.println("The whole queue array :");
    for(int n :queue){
        System.out.print(n + " ");
    }
    System.out.println(" ");
}
public void dequeue(){
    if(queueisEmpty()){
        System.out.println("Queue is empty. Cannot dequeue.");
    }else{
    int data = queue[front];
    front = (front+1)%capacity;
    size--;
    System.out.println("Dequeued element: " + data);
}
}
public int getsize(){
    return size;
}
public boolean queueisEmpty(){
    return getsize()== 0;
}
public boolean queueisFull(){
    return getsize() == capacity;
}
}public class QueueUsingArray {
    public static void main(String[] args){
        Queue myqueue1 = new Queue();
        myqueue1.enqueue(52);
        myqueue1.enqueue(55);
        myqueue1.enqueue(69);
        myqueue1.enqueue(74);
        myqueue1.dequeue();
        myqueue1.dequeue();
        myqueue1.enqueue(80);
        myqueue1.enqueue(82);
        myqueue1.show();
        System.out.println("Size is :" + myqueue1.getsize());
        System.out.println("Is the queue Empty ?"+ myqueue1.queueisEmpty());
        System.out.println("Is the queue Full ?"+ myqueue1.queueisFull());

    }
}

