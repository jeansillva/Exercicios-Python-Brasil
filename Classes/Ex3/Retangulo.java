package Classes.Ex3;

public class Retangulo {
    double ladoA;
    double ladoB;
    double area;
    double perimetro;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    void mudarValorDoLadoRetangulo(double novoLadoA, double novoLadoB) {
        ladoA = novoLadoA;
        ladoB = novoLadoB;
    }

    void retornarValorDoLadoRetangulo() {
        System.out.printf("O valor dos lados sao: %.2f e %.2f%n", ladoA, ladoB);
    }

    void calcularAreaRetangulo() {
        area = ladoA * ladoB;
    }

    void calcularPerimetroRetangulo() {
        perimetro = 2 * (ladoA + ladoB);
    }
}
