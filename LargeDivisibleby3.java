//Find the largest number divisible by 3
public class LargeDivisibleby3 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 3, 15};
        int largest = -1;
        for (int num : arr) {
            if (num % 3 == 0 && num > largest) largest = num;
        }
        System.out.println("Largest divisible by 3: " + largest);
    }
}
