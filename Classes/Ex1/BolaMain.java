package Classes.Ex1;

public class BolaMain {
    String cor;
    double circunferencia;
    String material;

    public BolaMain(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    void trocaCor(String novaCor) {
        cor = novaCor;
    }

    void mostraCor() {
        System.out.println("A cor é: " + cor);
    }

}
