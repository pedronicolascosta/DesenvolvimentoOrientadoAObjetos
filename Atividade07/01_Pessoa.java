//exercicio 01
//autor: Pedro Nicolas Costa

package uscs;
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void Imprime(){
        System.out.println("Dados da Pessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void getIdade(int idade){
        this.idade = idade;
    }
  
}
