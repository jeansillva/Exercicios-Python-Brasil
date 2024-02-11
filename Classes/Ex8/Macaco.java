package Classes.Ex8;

public class Macaco {

    String nome;
    String bucho;

    void comer(String alimento) {
        System.out.println("Alimento consumido!");
        bucho = alimento;
    }

    void verBucho() {
        System.out.println("Bucho: " + bucho);
    }

    void digerir() {
        System.out.println("Alimento digerido!");
        bucho = null;
        verBucho();
    }

}
