package Classes.Ex13e14;

public class Funcionario {

    /*
     * Desafio 13:
     * Implemente a classe Funcionário. Um empregado tem um nome (um string) e um
     * salário(um double). Escreva um construtor com dois parâmetros (nome e
     * salário) e métodos para devolver nome e salário. Escreva um pequeno programa
     * que teste sua classe.
     */

    /*
     * Desafio 14:
     * Aprimore a classe do exercício anterior para adicionar o método
     * aumentarSalario (porcentualDeAumento) que aumente o salário do funcionário em
     * uma certa porcentagem.
     */

    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void retornaNome() {
        System.out.println("Nome: " + nome);
    }

    void retornaSalario() {
        System.out.println("Salario: R$" + salario);
    }

    void aumentarSalario(double porcentualDeAumento) {
        salario *= (1 + porcentualDeAumento);
        System.out.printf("Novo salario: %.2f", salario);
    }

}
