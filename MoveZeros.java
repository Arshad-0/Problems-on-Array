//Move all zeros to the end
public class MoveZeros {
          public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 3};
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) arr[nonZeroIndex++] = arr[i];
        }
        while (nonZeroIndex < arr.length) arr[nonZeroIndex++] = 0;
        for (int num : arr) System.out.print(num + " ");
    }
}
