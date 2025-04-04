import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual N-estimmo você quer da sequência de Fibonacci?");
        int n = scanner.nextInt();

        int resultado = fiboncci(n);

        System.out.println("O "+ n + " dda sequência de Fibonacci é "+ fiboncci(n));

        scanner.close();
    }

    public static int fiboncci(int n){
        if (n <= 1){
            return n;
        }
        return fiboncci(n - 1) + fiboncci(n-2);
    }
}
