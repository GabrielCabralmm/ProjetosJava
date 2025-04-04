import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos lados tem o polígono? ");
        double lados = scanner.nextInt();

        System.out.println("Qual a medida dos lados? ");
        double medida = scanner.nextDouble();

        double area = (medida * Math.pow(lados, 2))/(4*Math.tan(Math.PI/lados));

        System.out.printf("A área do polígono: %.2f", area);

        scanner.close();
    }
}
