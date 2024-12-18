// Find all the prime numbers in an array
public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 11, 12};
        for (int num : arr) {
            if (isPrime(num)) System.out.print(num + " ");
        }
    }
}

