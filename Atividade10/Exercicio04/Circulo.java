package uscs;
public class Circulo implements AreaCalculavel{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double calculaArea(){
        return Math.PI*raio*raio;
    }
    
    public double perimetro(){
        return (2*Math.PI*raio);
    }
}