package uscs;
public class Aniversario extends CartaoWeb{
    
    public Aniversario(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
        System.out.println("Parabéns " + getDestinatario() + "! Está ficando mais velho ein!");
    }
}
