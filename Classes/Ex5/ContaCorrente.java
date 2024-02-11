package Classes.Ex5;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    void alterarNome(String novoNome) {
        nomeCorrentista = novoNome;
    }

    void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    void saque(double valorSaque) {
        saldo -= valorSaque;
    }

}
