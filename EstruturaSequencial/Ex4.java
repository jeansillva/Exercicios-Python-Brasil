import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota bimestral: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota bimestral: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota bimestral: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite a quarta nota bimestral: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A media das notas bimestrais: " + media);

        sc.close();

    }
}
