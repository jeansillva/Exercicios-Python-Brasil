import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double multa;
        double excedeu;

        System.out.println("Qual o peso dos peixes? ");
        double peso = sc.nextDouble();

        if (peso <= 50 && peso > 0) {
            System.out.println("Voce nao excedeu o peso de pesca! ");
        } else {
            excedeu = peso - 50;
            multa = 4 * excedeu;
            System.out.println("Voce excedeu " + excedeu + "KG! A multa sera de: R$" + multa);
        }
        sc.close();
    }
}
