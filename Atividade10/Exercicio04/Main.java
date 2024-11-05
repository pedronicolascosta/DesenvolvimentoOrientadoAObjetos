package uscs;
public class Main {
    public static void main(String[] args){
        Quadrado Q1 = new Quadrado(4.0);
        System.out.println("Área do Quadrado: " + Q1.calculaArea());
        System.out.println("Perimetro Quadrado: " + Q1.perimetro());
        
        Retangulo R1 = new Retangulo(4.0, 6.0);
        System.out.println("Área do Quadrado: " + R1.calculaArea());
        System.out.println("Perimetro Quadrado: " + R1.perimetro());
        
        Circulo C1 = new Circulo(1.0);
        System.out.println("Área do Quadrado: " + C1.calculaArea());
        System.out.println("Perimetro Quadrado: " + C1.perimetro());
    }
}
