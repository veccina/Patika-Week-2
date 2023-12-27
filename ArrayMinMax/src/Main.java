import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int enteredNumber = scanner.nextInt();

        Arrays.sort(array);

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int element : array) {
            if (element < enteredNumber && element > closestSmaller) {
                closestSmaller = element;
            } else if (element > enteredNumber && element < closestLarger) {
                closestLarger = element;
            }
        }

        System.out.println("Closest number smaller than the entered number: " + closestSmaller);
        System.out.println("Closest number larger than the entered number: " + closestLarger);

        scanner.close();
    }
}