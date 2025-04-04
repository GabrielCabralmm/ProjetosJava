import java.util.Scanner;

public class OperacoesDeControleIfElseIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }

        if (idade <= 10){
            System.out.println("Não paga!");
        } else if (idade < 18) {
            System.out.println("Paga meia!");
        } else {
            System.out.println("Paga inteiro!");
        }

        scanner.close();
    }
}
