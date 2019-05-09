
/**
 *
 * @author Denis
 */


public class Main {

    public static void main(String[] args) {

        int k = 41;
        int l = 56;
        System.out.println("\n ********** Tests for  Prime Numbers Initialized  ****************");
        System.out.println(String.format("Is %d a prime number : %b", k, Functions.isPrime(k)));
        System.out.println(String.format("Is %d a prime number : %b", l, Functions.isPrime(l)));
        System.out.println(" ***************Tests Ended *****************************\n");

        System.out.println(" ******************* Tests for memoization for the isPrime Function Initialized ****************");
        System.out.println(String.format("Is %d a prime number : %b", k, Functions.isPrimeMemoized(k)));
        System.out.println(String.format("Is %d a prime number : %b", l, Functions.isPrimeMemoized(l)));
        System.out.println(" ***************Tests Ended *****************************\n");

        int[] arr = {3, 4, 7, 6, 5,9, 1, 0};
        System.out.println(" ============ Begin testing search function that uses the binary search algorithm ===========");
        System.out.println(String.format("%d is at index  : %d", 7, Functions.search(arr, 7)));
        System.out.println(String.format("%d is at index  : %d", 1, Functions.search(arr, 1)));
        System.out.println(" ***************Tests Ended *****************************************************************\n");
    }



}





