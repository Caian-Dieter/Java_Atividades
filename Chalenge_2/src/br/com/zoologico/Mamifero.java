package br.com.zoologico;

public class Mamifero extends Animal{

    private boolean terrestre;

    public Mamifero(String nome, int altura, String som, String biomaNativo, boolean carnivoro, boolean terrestre) {
        super(nome, altura, som, biomaNativo, carnivoro);
        this.terrestre = terrestre;
    }

    public String aquatucoOuTerrestre(){
        if(terrestre){
            return (nomeAnimal() + " e terrestre");
        }
        else{
            return(nomeAnimal() + " e aquatico");
        }
    }
}
