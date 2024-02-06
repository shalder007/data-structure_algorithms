 class Dynamicarray {

        private int arr[];
        private int count;

        public Dynamicarray(int length) {
            arr = new int[length];
        }
    
        // Method 2
        // Inside helper class
        // To print array
        public void printArray() {
    
            // Iterating over array using for loop
            for (int i = 0; i < count; i++) {
    
                // Print the elements of an array
                System.out.print(arr[i] + " ");
            }
        }
 
        public void insert(int element) {
    
            if (arr.length == count) {
   
                int newArr[] = new int[2 * count];

                for (int i = 0; i < count; i++) {
                    newArr[i] = arr[i];
                }

                arr = newArr;
            }
    
            arr[count++] = element;
        }
    
    

        public static void main(String[] args) {

            Dynamicarray numbers = new Dynamicarray(3);
    

            numbers.insert(10);
            numbers.insert(30);
            numbers.insert(40);
            numbers.insert(50);
    
            numbers.printArray();
        }
    }


