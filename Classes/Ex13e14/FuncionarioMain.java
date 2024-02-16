package Classes.Ex13e14;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro", 3500);
        f1.retornaNome();
        f1.retornaSalario();
        f1.aumentarSalario(0.10);
        f1.retornaSalario();
    }
}
