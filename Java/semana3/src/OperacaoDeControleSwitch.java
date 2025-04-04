import java.util.Scanner;

public class OperacaoDeControleSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira o dia de hoje: ");
        int dia = scanner.nextInt();

        switch (dia){
            case 5:
                System.out.println("Recebo salário!");
                break;
            case 10:
                System.out.println("Pagar conta de luz!");
                break;
            case 15:
                System.out.println("Pgar internet!");
                break;
            default:
                System.out.println("Sem obbrigações financeiras!");
        }

        scanner.close();
    }
}
