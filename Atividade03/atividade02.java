//exercicio 02
//autor: Pedro Nicolas Costa

package uscs;
public class atividade02 {
   public static void main(String[] args){
       String a = new String("Hello");
       String b = new String(a+"USCS");
       String c = new String("a".concat(b));
       
       System.out.println(c);
   }
}