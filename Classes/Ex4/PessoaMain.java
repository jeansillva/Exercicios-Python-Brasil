package Classes.Ex4;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jean", 21, 65, 1.80);

        p1.envelhecer();
        System.out.println("Idade: " + p1.idade);

        p1.engordar();
        System.out.println("Peso: " + p1.peso);

        p1.emagrecer();
        System.out.println("Emagreceu! Novo peso: " + p1.peso);

        p1.crescer();
        System.out.println("Altura: " + p1.altura);
    }
}
