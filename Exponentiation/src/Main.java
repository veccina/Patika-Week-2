import java.util.Scanner;
public class Main {
    // Üs alma işlemi için recursive metot tanımlıyoruz.
    static int exponentiation(int base, int exponent){
        // Üs 0 ise sonuç her zaman 1.
        if (exponent == 0){
            return 1;
        } else  {
            //Üs değeri sıfır olana kadar tabanı üssü kadar çarp şeklinde denklem oluşturuyoruz.
            return base * exponentiation(base, exponent-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value : ");
        int exponent = scan.nextInt();

        //Metotla tanımladığımız işlemi çağırıyoruz ve sonucu ekrana bastırıyoruz.
        int result = exponentiation(base, exponent);
        System.out.println("Result : " + result);
    }
}