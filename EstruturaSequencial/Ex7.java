import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
        // desta área para o usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        double dobro = area * 2;

        System.out.println("O dobro da area digitada é: " + dobro);
        sc.close();
    }
}
