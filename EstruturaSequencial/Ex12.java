import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Tendo como dados de entrada a altura de uma pessoa,
        // construa um algoritmo que calcule seu peso ideal,
        // usando a seguinte fórmula: (72.7*altura) - 58
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura atual: ");
        double altura = sc.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal: " + peso);
        sc.close();
    }
}
