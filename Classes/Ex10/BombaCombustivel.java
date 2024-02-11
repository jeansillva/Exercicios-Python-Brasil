package Classes.Ex10;

public class BombaCombustivel {
    String tipoCombustivel = "Diesel";
    double valorLitro;
    double quantidadeCombustivel;

    public BombaCombustivel(double valorLitro, double quantidadeCombustivel) {
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    double abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (quantidadeCombustivel > 0 && quantidadeCombustivel > litrosAbastecidos) {
            quantidadeCombustivel -= litrosAbastecidos;
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
        return litrosAbastecidos;
    }

    double abastecerPorLitro(double litros) {
        if (quantidadeCombustivel > 0 && quantidadeCombustivel > litros) {
            quantidadeCombustivel -= litros;
            System.out.println("Foram abastecidos " + litros + " litros!");
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
        return litros * valorLitro;
    }

    void alterarCombustivel(String novoTipo) {
        tipoCombustivel = novoTipo;
        System.out.println("Tipo do combustivel alterado para: " + tipoCombustivel);
    }

    void alterarQuantidadeCombustivel(double quantidadeRestante) {
        if (quantidadeRestante < 0 && quantidadeRestante > 100) {
            System.out.println("Quantidade inválida!");
        } else {
            quantidadeCombustivel = quantidadeRestante;
            System.out.println("Quantidade restante na bomba: " + quantidadeRestante);
        }
    }

}
