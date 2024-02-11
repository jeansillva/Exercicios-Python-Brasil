package Classes.Ex3;

import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor de um lado do retangulo: ");
        double ladoA = sc.nextDouble();

        System.out.println("Digite o segundo valor de um lado do retangulo: ");
        double ladoB = sc.nextDouble();
        sc.close();

        Retangulo r1 = new Retangulo(ladoA, ladoB);
        r1.retornarValorDoLadoRetangulo();

        r1.calcularAreaRetangulo();
        System.out.println("O valor da area: " + r1.area);

        r1.calcularPerimetroRetangulo();
        System.out.println("O valor do perimetro: " + r1.perimetro);
    }
}
