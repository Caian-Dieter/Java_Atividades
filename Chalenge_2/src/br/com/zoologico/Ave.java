package br.com.zoologico;

public class Ave extends Animal {

    private boolean voa;
    private boolean fazNinho;
    private boolean migra;

    public Ave(String nome, int altura, String som, String biomaNativo, boolean carnivoro, boolean voa, boolean fazNinho, boolean migra) {
        super(nome, altura, som, biomaNativo, carnivoro);
        this.voa = voa;
        this.fazNinho = fazNinho;
        this.migra = migra;
    }

    public String voar(){
        if(voa == true){
            return(nomeAnimal() + " pode voar");
        }
        else{
            return(nomeAnimal() + " nao pode voar");
        }
    }

    public String fazNinho(){
        if(fazNinho == true){
            return(nomeAnimal() + " faz ninho");
        }
        else{
            return(nomeAnimal() + " nao faz ninho");
        }

    }

    public String migra(){
        if(migra == true){
            return(nomeAnimal() + " migra");
        }
        else{
            return(nomeAnimal() + " nao migra");
        }

    }


}
