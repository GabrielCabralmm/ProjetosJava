import java.util.Scanner;

public class OperacaoDeControleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int num = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }

        System.out.println("Em ordem decrescente: ");
        for (int i = num-1; i > 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
