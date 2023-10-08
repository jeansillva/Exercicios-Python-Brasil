import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a area em metros quadrados:");
        double area = sc.nextDouble();
        sc.close();

        double litros = area / 3;
        double latas = litros / 18;
        double preco = latas * 80;

        System.out.printf("A quantidade de latas a serem compradas são:"
                + "%d e o preço total é de R$%.2f%n", latas, preco);

    }
}
