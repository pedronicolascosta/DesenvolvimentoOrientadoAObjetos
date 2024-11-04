package uscs;
public class Main {
    public static void main(String[] args){
        Animal animal1 = new Cachorro("Rex", 3);
        Animal animal2 = new Gato("Whiskers", 5);
        
        animal1.emitirSom();
        animal2.emitirSom();
    }
}
