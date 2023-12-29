import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("Welcome to the game!");
        System.out.println("Guess the number between 0 and 100");
        while (right < 5) {
            System.out.println("You have " + (5 - right) + " right to guess");
            selected = input.nextInt();
            if (selected < 0 || selected > 100) {
                System.out.println("Please enter a number between 0 and 100");
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations! You won!");
                isWin = true;
                break;
            } else {
                System.out.println("Wrong number!");
                wrong[right] = selected;
                right++;
                if (selected > number) {
                    System.out.println(selected + " is bigger than the number");
                } else {
                    System.out.println(selected + " is smaller than the number");
                }
            }
        }
    }
}