package uscs;
public class TesteProduto {
   public static void main(String[] args){
        Produto p1 = new Produto();
        p1.ImprimeTotalProdutos();
        p1.retornaStatusEstoque();
        
        System.out.println("----------------");
        
        Produto p2 = new Produto("AB998X", "Volkswagem TCROSS", 20);
        p2.ImprimeTotalProdutos();
        p2.retornaStatusEstoque();
        
        p1.AlteraLimiteEstoque(60);  
   } 
}