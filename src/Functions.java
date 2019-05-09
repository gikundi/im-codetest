import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 *
 * @author Denis
 */

class Functions {

    //using wrapper classes with Generics
    private static final Function<Integer, Boolean> CACHED = Functions.memoize(Functions::isPrime);

    // Function checks for a number divisible by only 1 and itself
    static  boolean isPrime(int num) {

        // Check to make sure that integer number is a positive number
        if (num < 1){
            return  false;
        }

      for (int k = 2; k <= num/2; k++ ) {
          if( num % k == 0 ) {
               return false;
          }
      }
      return true;


    }

    // memoize function takes any function as input and returns a memoized version of that function
    private static <I, O> Function<I, O> memoize(Function<I, O> f) {
        Map<I, O> lookup = new HashMap<>();
        return input -> lookup.computeIfAbsent(input, f);
    }


    //implement memoization of the isPrime function
    static Boolean isPrimeMemoized(int x) {
        return CACHED.apply(x);
    }


    //Binary search algorithm to Search an array
    static int search(int[] arr, int value) {

         // Begin By sorting the array in ascending Order
        sortArrayAscOrder(arr);

        // Compares the key value with the middle element of the array
        //if value is less than the middle then search the left side of the array
        //if value is greater than the middle element then search the right side of the array
        // return -1 if value is absent in the array

        int low = 0;
        int size = arr.length;
        int high = size - 1;
        while (low<=high) {
            int middle = (low + high) / 2;
            if (arr[middle] == value) {
                return middle;
            }
            else if (arr[middle] < value) {
                low = middle + 1;
            }
             else high = middle - 1;

        }
        return -1;
    }

    //Before searching the array first sort it in ascending order
    private static void sortArrayAscOrder(int[] arr) {
        //only swap the array values whenever the value before is greater than the value after
        //if no swap occurs, the array is sorted, hence exit
       int i, j;
        int size = arr.length;
        boolean swap;
        for (i = 0; i < size - 1; i++) {
            swap = false;
            for (j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }




}
