class InsertionSort {
    public static void main(String[] array) {
        sort(array);
        printArray(array);
    }
    
    public static void sort(String[] array){
        //Loops through every indeks from 1 to the end:
        for (int i = 1; i < array.length; i++){
            int j = i;
            //If the previous element is bigger than the current element.
            while ((j > 0) && (Integer.parseInt(array[j-1]) > Integer.parseInt(array[j]))){
                //Switches place between the previous element and the current.
                String previous = array[j-1];
                String thisElement = array[j];
                array[j-1] = thisElement;
                array[j] = previous;
                j = j-1;
                //Checks the other lower indexes if the element is bigger.
            } //Stops when every index is sortet from the currents index and bakwards to the start.
        }//Stops when the whole array is sorted.
    }
    public static void printArray(String[] array){
        //Prints the sorted array:
        System.out.print("[");
        for (String e: array){

            System.out.print(e + ", ");
        }
        System.out.print("]");
    }


}