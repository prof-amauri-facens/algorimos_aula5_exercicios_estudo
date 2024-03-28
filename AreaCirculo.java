import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double raio, area = 0.0;
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        raio = scanner.nextDouble();
        
        area = pi * raio * raio;
        
        System.out.println("Area do circulo eh: " + area);
    }
}
