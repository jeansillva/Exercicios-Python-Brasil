package Classes.Ex13e14;

public class Funcionario {
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
