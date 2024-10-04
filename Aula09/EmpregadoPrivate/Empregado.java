package uscs;
public class Empregado {
    private static int contador = 0;
    
    private int codEmpr;
    private String nome;
    private String cargo;
    private double salario;
    
    public Empregado(){
        contador++;
        codEmpr = contador;
    }
    
    public Empregado(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        
        contador++;
        this.codEmpr = contador;
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

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empregado.contador = contador;
    }

    public int getCodEmpr() {
        return codEmpr;
    }

    public void setCodEmpr(int codEmpr) {
        this.codEmpr = codEmpr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
}
