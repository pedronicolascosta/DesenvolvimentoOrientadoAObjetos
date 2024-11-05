package uscs;
public class Main {
    public static void main(String[] args){
        CartaoWeb cartao1 = new DiaDosNamorados("Carol");
        cartao1.showMessage();
        
        CartaoWeb cartao2 = new Natal("Pedro");
        cartao2.showMessage();
        
        CartaoWeb cartao3 = new Aniversario("João");
        cartao3.showMessage();
    }
}
