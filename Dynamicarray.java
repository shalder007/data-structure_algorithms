 class Dynamicarray {

        // Member variables of this class
        // Private access modifier
        private int arr[];
        private int count;
    
        // Note they can only be called through function
    
        // Method 1
        // Inside helper class
        // to compute length of an array
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
    
        // Method 3
        // Inside Helper class
        public void insert(int element) {
    
            if (arr.length == count) {
    
                // Creating a new array double the size
                // of array declared above
                int newArr[] = new int[2 * count];
    
                // Iterating over new array using for loop
                for (int i = 0; i < count; i++) {
                    newArr[i] = arr[i];
                }
    
                // Assigning new array to the original array
                // created above
                arr = newArr;
            }
    
            arr[count++] = element;
        }
    
    

        public static void main(String[] args) {
    
            // Creating object of Dynamicarray class
            Dynamicarray numbers = new Dynamicarray(3);
    

            numbers.insert(10);
            numbers.insert(30);
            numbers.insert(40);
            numbers.insert(50);
    
            // Calling the printArray() method to print
            // new array been dynamically created
            numbers.printArray();
        }
    }


