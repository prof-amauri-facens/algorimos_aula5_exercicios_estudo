import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o num: ");
        num = scanner.nextDouble();

        num = num * num;

        System.out.println("Resultado do quadrado: " + num);

    }
    
}
