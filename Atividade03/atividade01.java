//exercicio 01
//autor: Pedro Nicolas Costa

package uscs;
public class atividade01 {
   public static void main(String[] args){
       String a = new String("USCS");
       String b = new String("Computacao");
       a = b;
       b = a;
       System.out.println(a);
       System.out.println(b);
   }
}