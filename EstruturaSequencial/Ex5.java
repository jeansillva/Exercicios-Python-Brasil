import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Faça um Programa que converta metros para centímetros.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = sc.nextDouble();
        double converte = metros * 100;

        System.out.println("O valor em centimetros: " + converte);
        sc.close();
    }
}
