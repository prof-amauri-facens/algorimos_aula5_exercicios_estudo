import java.text.DecimalFormat;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Media{
    public static void main (String[] args){
        double soma = 0.0;
        double resultado = 0.0; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero 1: ");
        soma = soma + scanner.nextDouble();
        System.out.println("Digite numero 2: ");
        soma = soma + scanner.nextDouble();
        System.out.println("Digite numero 3: ");
        soma = soma + scanner.nextDouble();
        resultado = soma/3;
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato com duas casas decimais
        System.out.println("A media eh: " + df.format(resultado));
        
        

    }
}