import java.util.Scanner;

public class Main {
    public Main() {
    }

    static boolean isPalindrom(int number) {
        int temp = number;

        int reverseNumber;
        for(reverseNumber = 0; temp != 0; temp /= 10) {
            int lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if the number is palindrom : ");
        int digit = scan.nextInt();
        boolean sonuc = isPalindrom(digit);
        if (sonuc) {
            System.out.println("" + digit + " is a palindrom number");
        } else {
            System.out.println("" + digit + " is not a palindrom number");
        }

    }
}
