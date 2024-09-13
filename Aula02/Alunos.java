package uscs;
public class Alunos{
    //atributos
    String nome;
    int codmat;
    String cpf;
    char sexo;
    double nota_P1;
    double nota_P2;
    double nota_P3;
    
    //métodos
    public Alunos(){ 
        
    }
    
    public void imprimirAlunos(){
        System.out.println("Nome: " + nome);
        System.out.println("Código de Matrícula: " + codmat);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + imprimirSexo(char sexo.Alunos));
        System.out.println("Nota 01: " + nota_P1);
        System.out.println("Nota 02: " + nota_P2);
        System.out.println("Nota 03: " + nota_P3);    
    }
    
    public void imprimirSexo(char sexo){
        if(sexo == 'M'){
           System.out.println("Masculino"); 
        }
        else if(sexo == 'F'){
            System.out.println("Feminino"); 
        }
        else{
            System.out.println("Não identificado.");    
        }
    }
    
}
