package Classes.Ex8;

public class MacacoMain {

    public static void main(String[] args) {
        Macaco m1 = new Macaco();
        Macaco m2 = new Macaco();

        m1.comer("Banana");
        m1.verBucho();
        m1.digerir();

        m2.comer("Pedaço de maça");
        m2.verBucho();

    }
}
