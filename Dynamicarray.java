 public class Dynamicarray {
    public  int[] array;
    public  int size;
    Dynamicarray(int size){
        array = new int[size];
    }
    public void printarray(){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public void addelement(int element){
        if(array.length == size){
            int[] newarray = new int[2* size];
            for(int i = 0;i<array.length;i++){
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[size] = element;
        size++;
    }
    public void removeElement(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;  
        size--;
    }
    public int getElement(int index) {
        return array[index];
    }
    public int getSize() {
        return size;
    }
    public void shrink() {
        if (size < array.length / 2) {
            int[] newarray = new int[array.length / 2];
            for (int i = 0; i < size; i++) {
                newarray[i] = array[i];
            }
            array = newarray;
        }
    }
    public static void main(String[] args){
        Dynamicarray array= new Dynamicarray(8);
        array.addelement(22);
        array.addelement(33);
        array.addelement(44); 
        array.addelement(55);
        array.removeElement(1);
        array.removeElement(2);
        array.shrink();
        array.printarray();
        System.out.println("Size: " + array.getSize());
    }
    }


