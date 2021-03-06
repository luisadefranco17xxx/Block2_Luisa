public class PrimeFactorsDecomposition {
    public static void main(String[] args) {

        long nummer= 28561;
        System.out.println("The largest prime factor of the nummer "+nummer+" ist: "+decomposePrimeFactors(nummer));
        nummer = 75;
        //nummer = 600851475143l;
        System.out.println("The largest prime factor of the nummer "+nummer+" ist: "+decomposePrimeFactors(nummer));

    }


 /*   private static List<Integer> findPrimeNumbers(int n) {
        // initialize the array with "true", index denotes the numbers from 0 to n.
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        //loop from 2 to x until x*x becomes greater than n
        for (int i = 2; i * i < n; i++) {
            // process if the number is not already marked
            if (primes[i]) {
                // find the multiples and mark them as false
                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }

        // populate the list of prime numbers from the array and return it
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
*/

    public static int decomposePrimeFactors(long value){
        int largestFactor=0;
        int factor=0;
        while (value!=1) {
            if (value % 2 == 0) {
                factor = 2;
                value = value / 2;
            }
            if (value % 3 == 0) {
                factor = 3;
                value = value / 3;
            }
            if (value % 5 == 0) {
                factor = 5;
                value = value / 5;
            }
            if (value % 7 == 0) {
                factor = 7;
                value = value / 7;
            }
            if (value % 11 == 0) {
                factor = 11;
                value = value / 11;
            }
            if (value % 13 == 0) {
                factor = 13;
                value = value / 13;
            }

            if (factor>= largestFactor) {
                largestFactor = factor;
            }
        }

        return largestFactor;
    }
}
