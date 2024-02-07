class Stack {
    static final int MAX = 5;
    int top = -1;
    int stackarray[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
    }

    public void push(int data) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stackarray[top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stackarray[top] +" popped from stack");
            stackarray[top] = 0;
            top--;
        }
    }

    public void peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
        } else {
            int data = stackarray[top];
            System.out.println("Top element is: " + data);
        }
    }

    public void print() {
        for (int i : stackarray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

public void stackisempty(){
    if(top<0){
        System.out.println("The stack is empty.");
    }else{
        System.out.println("The stack has " + (top+1) +" items.");
    }

}
}

class StackUsingArray {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.print();
        s.stackisempty();
    }
}
