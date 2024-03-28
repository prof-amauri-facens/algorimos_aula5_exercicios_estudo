import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        double base, altura, area = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        altura = scanner.nextDouble();

        area = base * altura / 2;

        System.out.println("A area do triangulo com base " +
                            base + " e altura " + altura +
                            " eh: " + area);

    }
    
}
