import java.util.Scanner;

public class Main {
    // Metodumuzu oluşturuyoruz.
    public static void printNumber (int n, int original){
    // Önce n sayısının 0 ya da eksi olma durumunu kontrol ediyor ve ekrana yazdırıyor. Metodu return ile sonlandırıyor.
        if (n <= 0){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        //Metodu tekrar çağırıyor ve n'den 5 azaltarak devam ediyor.
        printNumber(n-5,original);

        //N original ile aynı değilse n'i tekrar yazdırır aksi halde başlangıç değerini yazdırır.
        if (n != original){
            System.out.print(n + " ");
        }else{
            System.out.print(original+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan n sayısını istiyoruz.
        System.out.print("Enter a value for n : ");
        int n = scan.nextInt();

        //Metodumuzu çağırıyoruz.
        printNumber(n, n );
    }
}