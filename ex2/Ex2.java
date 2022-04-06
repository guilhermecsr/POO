package ex2;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            float r, s, t;
            
            System.out.print("Digite o valor de R: ");
            r = ler.nextFloat();
            System.out.print("Digite o valor de S: ");
            s = ler.nextFloat();
            System.out.print("Digite o valor de T: ");
            t = ler.nextFloat();
            
            if (r > s && r > t)   System.out.println("R é maior");
            else if (s > r && s > t)   System.out.println("S é maior");
            else if (t > r && t > s)   System.out.println("T é maior");
        }
    
        
    }
}
