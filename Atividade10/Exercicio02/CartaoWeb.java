package uscs;
public abstract class CartaoWeb {
    protected String destinatario;
    
    public CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }
    
    public String getDestinatario(){
        return destinatario;
    }
    
    public abstract void showMessage();
}
