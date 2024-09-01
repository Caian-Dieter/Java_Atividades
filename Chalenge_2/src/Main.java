import br.com.zoologico.Animal;
import br.com.zoologico.Mamifero;
import br.com.zoologico.Ave;


public class Main {
    public static void main(String[] args) {

    Ave Arara = new Ave("Blue",1,"crawl crawl","floresta",false,true,true,true);

    System.out.println("nome : " + Arara.nomeAnimal());
    System.out.println(Arara.fazNinho());
    System.out.println(Arara.migra());
    System.out.println(Arara.voar());
    System.out.println(Arara.alturaAnimal() + " metros");
    System.out.println(Arara.alimentacao());
    Arara.fazerSom();
    System.out.println(Arara.biomaNativoAnimal());
    System.out.println();

    Mamifero Gorila = new Mamifero("Costas prateadas",2,"URROO!!","floresta",false,true);

    System.out.println("nome : " + Gorila.nomeAnimal());
    System.out.println(Gorila.alimentacao());
    Gorila.fazerSom();
    System.out.println(Gorila.alturaAnimal() + " metros");
    System.out.println(Gorila.biomaNativoAnimal());





    }
}