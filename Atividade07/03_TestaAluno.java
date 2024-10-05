//exercicio 03
//autor: Pedro Nicolas Costa

package uscs;
public class TestaAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Ana Souza", 31, 1234);
        Aluno a2 = new Aluno("Bia Nunes", 25, 5678);
        Aluno a3 = new Aluno("Paulo Santos", 45, 9876);
        
        a1.ImprimeAluno();
        a2.ImprimeAluno();
        a3.ImprimeAluno();
    }
}
