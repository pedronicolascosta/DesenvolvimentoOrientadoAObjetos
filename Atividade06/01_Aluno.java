//exercicio 01
//Criar uma classe Aluno
//autor: Pedro Nicolas Costa

package uscs;
public class Aluno {
    //atributos
    private String nome;
    private int codmat;
    private String cpf;
    private char sexo;
    private double nota_P1;
    private double nota_P2;
    private double nota_P3;

    //métodos
    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3) {
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;
    }

    public void ImprimeAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Nota P1: " + nota_P1);
        System.out.println("Nota P2: " + nota_P2);
        System.out.println("Nota P3: " + nota_P3);
    }

    public void ImprimeSexo() {
        System.out.print(nome + " - Sexo: ");
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else {
            System.out.println("Indefinido");
        }
    }

    public double MediaAluno() {
        double menorNota = Math.min(nota_P1, Math.min(nota_P2, nota_P3));
        return (nota_P1 + nota_P2 + nota_P3 - menorNota) / 2;
    }

    public String Resultado() {
        double media = MediaAluno();
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}