package Classes.Ex12;

public class ContaInvestimentoMain {

    /*
     * Faça uma classe contaInvestimento que seja semelhante a classe contaBancaria,
     * com a diferença de que se adicione um atributo taxaJuros. Forneça um
     * construtor que configure tanto o saldo inicial como a taxa de juros. Forneça
     * um método adicioneJuros (sem parâmetro explícito) que adicione juros à conta.
     * Escreva um programa que construa uma poupança com um saldo inicial de
     * R$1000,00 e uma taxa de juros de 10%. Depois aplique o método adicioneJuros()
     * cinco vezes e imprime o saldo resultante.
     */

    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento(0.10, 1000);
        System.out.println("Valor inicial: " + conta1.saldoInicial);
        conta1.adicioneJuros();
        conta1.adicioneJuros();
        conta1.adicioneJuros();
        conta1.adicioneJuros();
        conta1.adicioneJuros();
        System.out.printf("Saldo após aplicar juros: %.2f", +conta1.saldoInicial);
    }
}
