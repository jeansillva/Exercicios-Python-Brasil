import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Para homens: (72.7*h) - 58
        // Para mulheres: (62.1*h) - 44.7

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double h = sc.nextDouble();
        double alturaH = (72.7 * h) - 58;
        double alturaM = (62.1 * h) - 44.7;
        System.out.println("Peso Ideal do Homem: " + alturaH + "\nPeso Ideal da Mulher: " + alturaM);
        sc.close();
    }
}
