//exercicio 02
//autor: Pedro Nicolas Costa

package uscs;
public class Aluno extends Pessoa {
    private int matricula;
    
    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
 
    public void ImprimeAluno(){
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
    }
}
