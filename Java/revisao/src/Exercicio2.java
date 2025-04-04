import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infrome o ângulo A:");
        double anguloA = scanner.nextDouble();

        System.out.println("Infrome o ângulo B:");
        double anguloB = scanner.nextDouble();

        System.out.println("Infrome o ângulo C:");
        double anguloC = scanner.nextDouble();

        if (anguloA + anguloB + anguloC != 180){
            System.out.println("Os ângulos não formam um triângulo");
        } else if (anguloA == 90 || anguloB == 90 || anguloC == 90) {
            System.out.println("O triângulo é um triângulo retângulo!");
        } else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
            System.out.println("O triângulo é um triângulo obtusângulo!");
        } else {
            System.out.println("O triângulo é um triângulo acutângulo!");
        }

        scanner.close();
    }
}
