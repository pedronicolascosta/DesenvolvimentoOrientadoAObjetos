//exercicio 02
//Criar uma classe chamada TestaCarros (main) que cria objetos, imprime as características do carro criado.
//autor: Pedro Nicolas Costa

package uscs;
public class TestaCarros {
    public static void main(String[] args) {
       Carros c1 = new Carros();
       c1.marca = "Toyota";
       c1.modelo = "Corolla";
       c1.ano = 2025;
       
       c1.imprimirCarros();
    }
}