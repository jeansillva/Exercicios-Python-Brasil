package Classes.Ex12;

public class ContaInvestimento extends ContaBancaria {
    double taxaJuros;

    public ContaInvestimento(double taxaJuros, double saldoInicial) {
        this.taxaJuros = taxaJuros;
        this.saldoInicial = saldoInicial;
    }

    void adicioneJuros() {
        saldoInicial *= (1 + taxaJuros);
    }
}
