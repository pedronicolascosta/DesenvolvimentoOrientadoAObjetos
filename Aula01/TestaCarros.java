package uscs;
public class TestaCarros {
    public static void main(String[] args) {
       Carros c1 = new Carros();
       Carros c2 = new Carros("GM", "Corsa", 1922);
       c1.setMarca("Toyota");
       c1.setModelo("Modelo");
       c1.setAno(2025);
       
       c1.imprimirCarros();
       c2.imprimirCarros();
    }
}