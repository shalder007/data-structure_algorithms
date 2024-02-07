class StackDynamicArray{
    Dynamicarray dynamicarray2 = new Dynamicarray(2);
    int top = -1;
    StackDynamicArray(){

    }
    public void push(int data){
        dynamicarray2.addelement(data);
        top++;
    }

    public void pop() {
        if (top >= 0) {
            System.out.println(dynamicarray2.getElement(top) + " removed from stack.");
            dynamicarray2.removeElement(top);
            top--;
        } else {
            System.out.println("Stack Underflow");
        }
    }
        
    public void show(){
        dynamicarray2.printarray();
    }
}



public class StackUsingDynamicArray {
    public static void main(String[] args){
        StackDynamicArray mystack2 = new StackDynamicArray();
        mystack2.push(44);
        mystack2.push(55);
        mystack2.push(66);
        mystack2.push(77);
        mystack2.show();
        mystack2.pop();
        mystack2.show();

    }
    
}