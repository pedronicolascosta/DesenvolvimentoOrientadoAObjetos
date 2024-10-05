//exercicio 02
//Criar uma classe chamada mamiferos, destacando pelo menos 4 atributos e 4 métodos
//autor: Pedro Nicolas Costa

package uscs;
public class Mamiferos {
    //Atributos
    String especie;
    String subclasse;
    String paisOrigem;
    String coloracao;
    
    //Métodos
    public void imprimirEletro(){
        System.out.println("Especie: " + especie);
        System.out.println("Subclasse: " + subclasse);
        System.out.println("Pais de Origem: " + paisOrigem);
        System.out.println("Cor: " + coloracao);
    }
    
    public void emitirSom(){
        System.out.println("Mamifero emitindo som...");
    }
    
    public void andar(){
        System.out.println("Mamifero andando...");
    }
    
    public void dormir(){
        System.out.println("Mamifero dormindo...");
    } 
}