//exercicio 02
//autor: Pedro Nicolas Costa

package uscs;
import java.util.Scanner;
public class Baskara {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o valor de A...");
        double a = s.nextDouble();
        
        System.out.print("Digite o valor de B...");
        double b = s.nextDouble();
        
        System.out.print("Digite o valor de C...");
        double c = s.nextDouble();
        
        double baskara = (Math.pow(b, 2.0) - 4*a*c);
        System.out.println("O valor da baskara = " + baskara);
        
        if (baskara>0){
            System.out.print("A equacao possui duas raizes reais e distintas");
            double x1 = (-b + Math.sqrt(baskara))/(2*a);
            double x2 = (-b - Math.sqrt(baskara))/(2*a);
            System.out.println("As raizes sao:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (baskara==0){
            System.out.print("A equacao possui uma unica raiz real");
            double x1 = (-b + Math.sqrt(baskara))/(2*a);
            System.out.println("A raiz e:");
            System.out.println("x1 = " + x1);
        }
        if (baskara<0){
            System.out.print("A equacao NAO possui raizes reais");
        }
    }
}