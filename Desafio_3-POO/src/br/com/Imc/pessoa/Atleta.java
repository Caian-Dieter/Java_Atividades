package br.com.Imc.pessoa;

public class Atleta extends Pessoa{

    private String esportePraticado;


    public Atleta(String nome, double altura, int peso, String esportePraticado) {
        super(nome, altura, peso);
        this.esportePraticado = esportePraticado;

    }

    @Override
    public double calculoIMC() {
        double valorBase = super.calculoIMC() ;
        double novoIMC = valorBase * 0.95;
        return novoIMC;
    }

    @Override
    public void exibirIMC() {
        super.exibirIMC();
    }
}
