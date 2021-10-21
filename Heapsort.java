public class Heapsort {
   public static void main(String[] array){
       int[] A = new int[array.length];
       //makes an int array instead of an String array.
        for(int i = 0; i < array.length; i++){
            String s = array[i];
            int number = Integer.parseInt(s);
            A[i] = number;
        }

       HeapSort(A);
        
   } 
   public static void BubbleDown(int[] A, int indeks, int n){
    int largest = indeks;
    int left = 2*indeks + 1;
    int right = 2*indeks + 2;

    //if the leftChild exist and is bigger than the biggest to now:
    if ((left < n) && (A[largest] < A[left])){
        //Then it switch places between these two.
        int biggest = largest;
        int leftchild = left;
        left = biggest;
        largest = leftchild;
    }
     //if the rightChild exist and is bigger than the biggest to now:
    if ((right < n) && (A[largest] < A[right])){
        //Then it switch places between these two.
        int biggest = largest;
        int rightchild = right;
        right = biggest;
        largest = rightchild;
    }
    //If the indeks we are on is not equal to the largest.
    if (indeks != largest){
        //Then we switch places between these two so that the biggest value is pushed up the tree.
        int i = A[indeks];
        int biggest = A[largest];
        A[indeks] = biggest;
        A[largest] = i;
        //then we start to bubble down from this largest value in the subtree.
        BubbleDown(A, largest, n);
    }
    //ends with a subtree that is sorted with the highest value on top.

   }
   public static void BuildMaxHeap(int[] A, int n){
       //Goes through every indeks from the middle and down to zero because indexes after the middle have no childs..
       //and it is therefor unnecessary to bubble these values
       for (int i = n/2; i >= 0; i--){
           BubbleDown(A, i, n);
       }
   }
   public static void HeapSort(int[] A){
       int n = A.length;
       BuildMaxHeap(A, n);
       for (int i = n-1; i >= 0; i--){
           int first = A[0];
           int thisElement = A[i];
           A[0] = thisElement;
           A[i] = first;
           BubbleDown(A, 0, i);
       }

       //Prints the sorted array:
       System.out.print("[");
       for (int number: A){
           if (A[A.length -1] == number){
               System.out.print(number);
           }
           else {
               System.out.print(number + ", ");
           }
       }
       System.out.print("]");
   }
}
