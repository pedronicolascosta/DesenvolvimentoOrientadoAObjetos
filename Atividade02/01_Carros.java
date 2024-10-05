//exercicio 01
//Criar uma classe chamada Carros da seguinte maneira
//Atributos: marca:String, modelo:String e ano:int
//Métodos: ligar(), acelerar() e frear()
//autor: Pedro Nicolas Costa

package uscs;
public class Carros {
    //Atributos
    public String marca;
    public String modelo;
    public int ano;
    
    //Métodos
    public Carros(){ 
    }
    
    public Carros(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void imprimirCarros(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public void ligar(){
        System.out.println("Carro ligando...");
    }
    
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    
    public void frear(){
        System.out.println("Carro freando...");
    }    
}