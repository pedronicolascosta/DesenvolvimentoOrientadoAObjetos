package uscs;
public class Empregado {
    public static int contador = 0;
    
    public int codEmpr;
    public String nome;
    public String cargo;
    public double salario;
    
    public Empregado(){
        contador++;
    }
    
    public Empregado(int codEmpr, String nome, String cargo, double salario){
        this.codEmpr = codEmpr;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        
        contador++;
    }
    
    public void imprimeEmpregado(){
        System.out.println("CodEmpr: " + codEmpr);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
    
    public static void totalEmpregados(){
        System.out.println("Total de empregados = " + contador);
    }
    
    
    
}
