import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu primeiro nome");
        String primeiroNome = scanner.next();
        System.out.println("Seja bem-vindo " + primeiroNome);

        System.out.println("Insira sua iddade");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Olá, " + primeiroNome + " sua idade é " + idade);

        scanner.close();
    }
}
