import java.util.Scanner;
public class Main {
    // Öncelikle sayının asal sayı olup olmadığını bulan bir recursive metod tanımlıyoruz.
    static boolean isPrime(int number, int divisor){
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0){
            return false;
        }
        return isPrime(number, divisor-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan sayı girmesini istitoruz.
        System.out.print("Enter a number : ");
        int number = scan.nextInt();

        //Metodumuzu da çağırarak kullanıcıdan alınan sayının asal sayı olup olmadığı ekrana yazdırılıyor.
        if (number <=1 ){
            System.out.println(number +" is not a prime number.");
        } else if (isPrime(number,number-1)) {
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number ");
        }
    }
}