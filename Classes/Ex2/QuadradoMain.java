package Classes.Ex2;

public class QuadradoMain {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado(6);
        q1.retornarValorDoLado();
        q1.calcularArea();

        q1.mudarValorDoLado(10);
        q1.retornarValorDoLado();
        q1.calcularArea();
    }
}
