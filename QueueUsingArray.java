class Queue{
    int[] queue = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;
Queue(){

}
public void enqueue(int data){
    queue[rear] = data;
    rear = (rear+1)%5;
    size++;
}
public void show(){
    System.out.println("Elements: ");
    for(int i = 0;i<size;i++){
        System.out.print(queue[(i+front)%5]+ " ");
    }
    System.out.println(" ");
    System.out.println("The whole queue :");
    for(int n :queue){
        System.out.print(n + " ");
    }
    System.out.println(" ");
}
public void dequeue(){
    if(size == 0){
        System.out.println("Queue is empty. Cannot dequeue.");
        return;
    }
    
    int data = queue[front];
    front = (front+1)%5;
    size--;
    System.out.println("Dequeued element: " + data);
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

    }
}

