import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o 1° número: ");
        int n1 = scanner.nextInt();

        System.out.println("Insira o 2° número: ");
        int n2 = scanner.nextInt();

        System.out.println("Insira o 3° número: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " é o maior número!");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior número!");
        } else {
            System.out.println(n3 + " é o maior número!");
        }

        scanner.close();
    }
}
