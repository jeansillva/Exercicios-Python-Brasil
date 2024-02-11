package Classes.Ex2;

public class Quadrado {
    double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    void mudarValorDoLado(double novoValor) {
        tamanhoDoLado = novoValor;
    }

    void retornarValorDoLado() {
        System.out.println("O valor do lado é: " + tamanhoDoLado);
    }

    void calcularArea() {
        double area = tamanhoDoLado * tamanhoDoLado;
        System.out.println("O valor da area é: " + area);
    }

}
