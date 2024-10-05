//exercicio 01
//autor: Pedro Nicolas Costa

package uscs;
import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Entre com o lado menor: ");
        double x1 = s.nextDouble();
        
        System.out.print("Entre com o lado maior: ");
        double x2 = s.nextDouble();
        
        //double x3 = Math.sqrt((x1*x1) + (x2*x2));
        double x3 = Math.sqrt(Math.pow(x1, 2.0) + Math.pow(x2, 2.0));
        System.out.print("\nHipotenusa = " + x3);
        
        double x4 = x1+ x2+ x3;
        System.out.print("\nPerimetro = " + x4);
        
        double x5 = (x1*x2)/2.0;
        System.out.print("\nÁrea = " + x5);
    }
}