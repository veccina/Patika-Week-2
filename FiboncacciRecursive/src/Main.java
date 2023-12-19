import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a term for the Fibonacci series : ");
        int n = scan.nextInt();

        System.out.println("Fibonacci series (first " + n + " terms) : ");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }
}