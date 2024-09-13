import br.com.Imc.pessoa.Pessoa;
import br.com.Imc.pessoa.Atleta;


public class Main {
    public static void main(String[] args) {

        Pessoa newObjPessoa = new Pessoa("Joaquim",1.65,80);


        newObjPessoa.exibirIMC();

        Pessoa newObjPessoa2 = new Atleta("JJ",1.65,75,"Corrida");


        newObjPessoa2.exibirIMC();

        Pessoa newObjPessoa3 = new Atleta("JJ",1.65,80,"Corrida");

        newObjPessoa3.exibirIMC();

        Atleta newObjAtleta = new Atleta("Joazin",1.65,80,"Boxe");

        newObjAtleta.exibirIMC();


    }
}