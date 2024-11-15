package uscs;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ColecaoAnimal {
    public static void main(String[] args){
        
        //item A) Criação de uma lista de animais
        List<String> animal = new ArrayList<>();
        animal.add("Tigre");
        animal.add("Leao");
        animal.add("Girafa");
        animal.add("Tatu");
        animal.add("Capivara");
        animal.add("Porco-Espinho");
        animal.add("Rinoceronte");
        animal.add("Leopardo");
        animal.add("Jacare");
        animal.add("Jiboia");
        
        System.out.println("------------------------------");
        
        //item B) Listar todos os animais utilizando forEach()
        for(String elemento: animal){
            System.out.println("Animal: " + elemento);
        }
        
        System.out.println("------------------------------");
        
        //item C) Remover o "leão" e o "jacaré"
        animal.remove(1); //remove a segunda posição no array (via índice)
        animal.remove("Jacare"); //remove a posição onde há "jacare" (via valor)
        
        //verifica se os animais foram deletados com sucesso
        for(String elemento: animal){
            System.out.println("Animal: " + elemento);
        }
        
        System.out.println("------------------------------");
        
        //item D) Verifica se "Tucano" está na lista, se estiver imprima "Tucano está na lista" e o remova, se não estiver imprima "Tucano não está na lista" e o adicione
        if(animal.contains("Tucano")){
            System.out.println("Tucano ESTA na lista!");
            animal.remove("Tucano");
        }
        else{
            System.out.println("Tucano NAO esta na lista!");
            animal.add("Tucano");
        }
        
        //verifica a lista
        for(String elemento: animal){
            System.out.println("Animal: " + elemento);
        }
        
        System.out.println("------------------------------");
        //item E) Repetir o processo do item D) para a Jiboia
        if(animal.contains("Jiboia")){
            System.out.println("Jiboia ESTA na lista!");
            animal.remove("Jiboia");
        }
        else{
            System.out.println("Jiboia NAO esta na lista!");
            animal.add("Jiboia");
        }
        
        //verifica a lista
        for(String elemento: animal){
            System.out.println("Animal: " + elemento);
        }
        
        System.out.println("------------------------------");
        //item F)  Ordene a lista por ordem alfabética
        Collections.sort(animal);
        
        //verifica a lista
        for(String elemento: animal){
            System.out.println("Animal: " + elemento);
        }  
    }
}

