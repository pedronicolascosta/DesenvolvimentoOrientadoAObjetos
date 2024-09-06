package uscs;
public class Carros {
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
