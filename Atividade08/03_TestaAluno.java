//exercicio 03
//autor: Pedro Nicolas Costa

package uscs;
public class TestaAluno {
    public static void main(String[] args){
       Pessoa p1 = new Pessoa("Jose", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
       p1.ImprimePessoa();
       
       System.out.println("----------------------");
       
       Aluno a1 = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 4.5, 8.0, 10);
       a1.ImprimeAluno();
       a1.Resultado();
    }
}
