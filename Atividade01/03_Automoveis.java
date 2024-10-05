//exercicio 03
//Criar uma classe chamada automóveis, destacando pelo menos 4 atributos e 4 métodos
//autor: Pedro Nicolas Costa

package uscs;
public class Automoveis {
    //Atributos
    String tipoAutomovel;
    String marca;
    String modelo;
    int ano;
    
    //Métodos
    public void imprimirAutomovel(){
        System.out.println("Tipo do automovel: " + tipoAutomovel);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public void ligar(){
        System.out.println("Ligando automovel...");
    }
    
    public void acelerar(){
        System.out.println("Acelerando automovel...");
    }
    
    public void frear(){
        System.out.println("Freando automovel...");
    } 
}