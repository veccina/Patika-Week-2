//Scanner ve Array sınıflarını import ediyoruz.
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Dizi boyutunu kullanıcıdan alıyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the array : ");
        int size = scanner.nextInt();

        // Kullanıcıdan elemanları almak için bir dizi oluşturuyoruz.
        int[] array = new int[size];

        System.out.println("Enter " + size + " numbers : ");

        // Elemanları diziye alıyoruz.
        for (int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array [i]= scanner.nextInt();
        }

        // Array.sort ile diziyi küçükten büyüğe sıralıyoruz.
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdırıyoruz.
        System.out.print("Sorted array : ");
        for (int num : array){
            System.out.print(num + " ");
        }
    }
}