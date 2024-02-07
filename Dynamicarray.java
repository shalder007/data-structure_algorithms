 public class Dynamicarray {
    public static int[] array;
    public static int size;
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
    public static void main(String[] args){
        Dynamicarray array= new Dynamicarray(2);
        array.addelement(22);
        array.addelement(33);
        array.addelement(44);
        array.addelement(55);
        array.addelement(66);
        array.printarray();
    }
    }


