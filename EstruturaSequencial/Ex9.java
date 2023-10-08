import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
         * Faça um Programa que peça a temperatura em graus Fahrenheit,
         * transforme e mostre a temperatura em graus Celsius.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = 5 * (Fahrenheit - 32) / 9;

        System.out.println("A temperatura de " + Fahrenheit + " em Celsius é de: " + Celsius);
        sc.close();
    }
}
