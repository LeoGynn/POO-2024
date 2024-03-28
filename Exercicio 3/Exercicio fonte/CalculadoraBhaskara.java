import java.util.Scanner; // Importa a classe Scanner
import java.lang.Math; // Importa a classe Math para os calculos matematicos

public class CalculadoraBhaskara {
    public static void main(String[] args) {

        // Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuario que digite a variavel da equacao
        System.out.print("Digite a variavel a: ");

        // Recebe a variavel a
        double a = scanner.nextDouble(); 

        // Recebe a variavel b
        System.out.print("Digite a variavel b: ");
        double b = scanner.nextDouble(); 

        // Recebe a variavel c
        System.out.print("Digite a variavel c: ");
        double c = scanner.nextDouble(); 

        // Calcula o delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Verifica se a equação tem raizes reais
        if (delta >= 0) {

            // Calcula as raizes usando a formula de Bhaskara
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Imprime as raizes
            System.out.println("As raizes da equacao sao:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {

            // Caso o delta seja negativo
            System.out.println("A equacao não possui raizes reais.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}