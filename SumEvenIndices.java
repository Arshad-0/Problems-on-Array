//Find the sum of elements at even indices
public class SumEvenIndices {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) sum += arr[i];
        System.out.println("Sum at even indices: " + sum);
    }
}
