//exercicio 02
//Criar uma classe TesteAluno
//autor: Pedro Nicolas Costa

package uscs;
public class TesteAluno {
    public static void main(String[] args) {
        Aluno X1 = new Aluno("Paulo", 55123, "800912345-12", 'M', 7.0, 6.0, 8.0);
        
        Aluno X2 = new Aluno("Ana", 991239, "500876123-15", 'F', 2.0, 6.0, 9.0);

        System.out.println(“Dados do Aluno X1");
        X1.ImprimeAluno();
        System.out.println("Média: " + X1.MediaAluno());
        System.out.println("Resultado: " + X1.Resultado());
        X1.ImprimeSexo();

        System.out.println(“Dados do Aluno X2");
        X2.ImprimeAluno();
        System.out.println("Média: " + X2.MediaAluno());
        System.out.println("Resultado: " + X2.Resultado());
        X2.ImprimeSexo();
    }
}