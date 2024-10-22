package uscs;
public class Produto {
    private String codProduto;
    private String descProduto;
    private int qtdeEstoque;
    
    public static int limiteSeguranca = 50;
    public static int qtdProdutos = 0;
    
    public Produto(){
        qtdProdutos++;
    }
    
    public Produto(String codProduto, String descProduto, int qtdeEstoque){
        this.codProduto = codProduto;
        this.descProduto = descProduto;
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
    
    
    public void retornaStatusEstoque(){
        if(qtdeEstoque >= limiteSeguranca){
            System.out.println("Estoque Regular");
        }
        else{
            if(qtdeEstoque == 0){
                System.out.println("Estoque Nulo");
            }
            else{
                System.out.println("Estoque Restrito");
            }
        }
    }
    
    public void ImprimeTotalProdutos(){
        System.out.println("Ha " + qtdProdutos + " produtos cadastrados.");
    } 
    
    public void AlteraLimiteEstoque(int novaQtde){
        limiteSeguranca = novaQtde;
    }
}
