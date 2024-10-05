//exercicio 02
//autor: Pedro Nicolas Costa

package uscs;
public class Aluno extends Pessoa{
    private int matricula;
    private double p1;
    private double p2;
    private double qtdeFaltas;
    
    public static int limiteFaltas = 10;
    public static double mediaAprovacao = 7.0;
    public static double mediaReprovacao = 3.0;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String endereco, String cpf, String rg, int matricula, double p1, double p2, int qtdeFaltas){
        super(nome, endereco, cpf, rg);
        this.matricula = matricula;
        this.p1= p1;
        this.p2 = p2;
        this.qtdeFaltas = qtdeFaltas;
    }
    
    public void ImprimeAluno(){
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota P1: " + p1);
        System.out.println("Nota P2: " + p2);
        System.out.println("Quantidade de Faltas: " + qtdeFaltas);
    }
    
    public void ImprimeFaltas(){
        System.out.println("Quantidade de Faltas: " + qtdeFaltas);
    }
    
    public void Resultado(){
        if (qtdeFaltas > limiteFaltas){
            System.out.println("Aluno REPROVADO!");
        }
        else{
            if( (p1+p2)/2 >= mediaAprovacao ){
                System.out.println("Aluno APROVADO!");
            }
            if( (p1+p2)/2 < mediaReprovacao ){
                System.out.println("Aluno REPROVADO!");
            }
            if( ((p1+p2)/2 >= mediaReprovacao) && ((p1+p2)/2 < mediaAprovacao)){
                System.out.println("Aluno EM REAVALIACAO!");
            }
        }
    }
}
