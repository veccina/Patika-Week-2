import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir kelime girin: ");
            String kelime = scanner.nextLine();

            if (isPalindromic(kelime)) {
                System.out.println(kelime + " palindromik bir kelime.");
            } else {
                System.out.println(kelime + " palindromik bir kelime değil.");
            }

            scanner.close();
        }

        public static boolean isPalindromic(String kelime) {
            int uzunluk = kelime.length();
            for (int i = 0; i < uzunluk / 2; i++) {
                if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
}