import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        float n1 = scanner.nextFloat();

        System.out.println("Informe um segunddo número:");
        float n2 = scanner.nextFloat();

        float soma = n1 + n2;
        System.out.println("Resultado: "+ soma);

        scanner.close();
    }
}
