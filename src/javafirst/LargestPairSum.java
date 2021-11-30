package javafirst;

/*public class SumofprimeNumber{
	public static void prime(int []arr,int n) {	
		int j = 0;
		int max = n == 1		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}*/
public class LargestPairSum {
	 
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
 
        int arr[] = { 12, 34, 10, 6, 40};
        System.out.println(largestPairSum(arr, arr.length));
    }
 
    private static int largestPairSum(int[] arr, int n)
    {
        int j = 0;
        int max = n == 1 ? arr[0] + arr[1] : arr[0];
        for (int i = 0; i < n; i++) {
            int sum = arr[j] + arr[i];
            if (sum > max) {
                max = sum;
                if (arr[j] < arr[i]) {
                    j = i;
                }
            }
        }
        return max;
    }
}

/*Java program to find minimum and maximum
//prime number in given array.
import java.util.*;

class GFG {

//Function to find count of prime
static void prime(int arr[], int n)
{
	// Find maximum value in the array
	int max_val = Arrays.stream(arr).max().getAsInt();

		
	// USE SIEVE TO FIND ALL PRIME NUMBERS LESS
	// THAN OR EQUAL TO max_val
	// Create a boolean array "prime[0..n]". A
	// value in prime[i] will finally be false
	// if i is Not a prime, else true.
	Vector<Boolean> prime = new Vector<Boolean>();
		for(int i= 0;i<max_val+1;i++)
			prime.add(Boolean.TRUE);
		
	// Remaining part of SIEVE
	prime.add(0, Boolean.FALSE);
	prime.add(1, Boolean.FALSE);
	for (int p = 2; p * p <= max_val; p++) {

		// If prime[p] is not changed, then
		// it is a prime
		if (prime.get(p) == true) {

			// Update all multiples of p
			for (int i = p * 2; i <= max_val; i += p)
				prime.add(i, Boolean.FALSE);
		}
	}

	// Minimum and Maximum prime number
	int minimum = Integer.MAX_VALUE;
	int maximum = Integer.MIN_VALUE;
	for (int i = 0; i < n; i++)
		if (prime.get(arr[i])) {
			minimum = Math.min(minimum, arr[i]);
			maximum = Math.max(maximum, arr[i]);
		}

	System.out.println("Minimum : " + minimum) ;
	System.out.println("Maximum : " + maximum );
}

//Driver code
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	int n = arr.length;

	prime(arr, n);
	}
}
/*This code is contributed by 29AjayKumar*/
