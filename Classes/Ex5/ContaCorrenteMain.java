package Classes.Ex5;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1234567890, "Jean", 1000);

        c1.alterarNome("Joao");
        System.out.printf("Novo nome: %s%n", c1.nomeCorrentista);

        c1.deposito(100);
        System.out.printf("Saldo apos deposito: %.2f%n", c1.saldo);

        c1.saque(20);
        System.out.printf("Saldo apos saque: %.2f%n", c1.saldo);
    }
}
