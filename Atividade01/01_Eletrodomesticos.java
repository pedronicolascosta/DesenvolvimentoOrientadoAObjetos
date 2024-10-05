//exercicio 01
//Criar uma classe chamada eletrodoméstico, destacando pelo menos 4 atributos e 4 métodos
//autor: Pedro Nicolas Costa

package uscs;
public class Eletrodomesticos {
    //Atributos
    String marca;
    String tipoEletro;
    String potencia;
    String cor;
    
    //Métodos
    public void imprimirEletro(){
        System.out.println("Marca: " + marca);
        System.out.println("Tipo do Eletrodomestico: " + tipoEletro);
        System.out.println("Potencia: " + potencia);
        System.out.println("Cor: " + cor);
    }
    
    public void ligarTomada(){
        System.out.println("Eletrodomestico ligando na tomada...");
    }
    
    public void configurandoEletro(){
        System.out.println("Escolhendo velocidade do eletro...");
    }
    
    public void desligarEletro(){
        System.out.println("Desligando eletro...");
    } 
}