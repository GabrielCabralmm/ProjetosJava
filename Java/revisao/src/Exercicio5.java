import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
