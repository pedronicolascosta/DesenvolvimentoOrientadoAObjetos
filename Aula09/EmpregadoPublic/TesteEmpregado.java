package uscs;
public class TesteEmpregado {
    public static void main(String[] args){
        Empregado e1 = new Empregado(1232, "Paulo Silva", "Gerente Financeiro", 15400);
        e1.imprimeEmpregado();
        
        System.out.println("---------------------------------");
        
        Empregado e2 = new Empregado();
        e2.codEmpr = 4567;
        e2.nome = "Ana Paula";
        e2.cargo = "Analista de Sistemas Senior";
        e2.salario = 10700;
        e2.imprimeEmpregado();
      
        Empregado.totalEmpregados();
    }
}