import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre
        // em graus Fahrenheit.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Celsius e de: " + Fahrenheit);
        sc.close();
    }
}
