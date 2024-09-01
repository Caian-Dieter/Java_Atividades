package br.com.zoologico;

//classe é a forma o que iremos usar para instanciar o objeto
public class Animal {



    private String nome;
    private int altura;
    private String som;
    private String biomaNativo;
    private boolean carnivoro;

    public Animal(String nome, int altura, String som, String biomaNativo, boolean carnivoro) {
        this.nome = nome;
        this.altura = altura;
        this.som = som;
        this.biomaNativo = biomaNativo;
        this.carnivoro = carnivoro;
    }

    public void fazerSom(){
        System.out.println(som);
    }

    public String nomeAnimal(){
        return( nome);
    }

    public int alturaAnimal(){
        return(altura);
    }

    public String biomaNativoAnimal(){
        return(biomaNativo);
    }

    public String alimentacao(){
        if(carnivoro == true){
            return (nome + " come carne");
        }
        else{
            return (nome + " come plantas");

        }
    }

}
