import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("O valor da area é de: " + area);
        sc.close();
    }
}
