package uscs;
public class TestaAlunos{
    public static void main(String[] args) {
       Alunos aluno1 = new Alunos();
       aluno1.nome = "Sophia";
       aluno1.codmat = 5478;
       aluno1.cpf = "123.456.789-10";
       aluno1.sexo = 'F';
       aluno1.nota_P1 = 7;
       aluno1.nota_P2 = 8;
       aluno1.nota_P3 = 10;
       
       aluno1.imprimirAluno();
    }
}
