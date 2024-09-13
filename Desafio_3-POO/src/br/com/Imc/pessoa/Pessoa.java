package br.com.Imc.pessoa;

public class Pessoa {

    private String nome;
    private double altura;
    private int peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Pessoa(String nome, double altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }


    public double calculoIMC(){
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public void exibirIMC(){
        System.out.println(calculoIMC());
        System.out.println();
    }

}
