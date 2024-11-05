package uscs;
public class Retangulo implements AreaCalculavel{
    private double lado;
    private double altura;
    
    public Retangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea(){
        return lado*altura;
    }
    
    @Override
    public double perimetro(){
        return (2*lado + 2*altura);
    }
}
