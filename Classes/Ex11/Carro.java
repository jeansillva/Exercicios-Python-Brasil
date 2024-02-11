package Classes.Ex11;

public class Carro {
    double quantidadeTanque;
    double consumoL;

    // O consumo é especificado no construtor e o nível de combustível inicial é 0.
    public Carro(double quantidadeTanque, double consumoL) {
        this.quantidadeTanque = 0;
        this.consumoL = consumoL;
    }

    // dirigir o veículo por uma certa distância
    void andar(double distancia) {
        quantidadeTanque -= (consumoL * distancia);
    }

    double obterGasolina() {
        return quantidadeTanque;
    }

    void adicionarGasolina(double adicionarGasolina) {
        quantidadeTanque += adicionarGasolina;
    }

}
