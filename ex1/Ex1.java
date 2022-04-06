package ex1;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int c=0, k, entrada;
            
            System.out.print("Quantos valores serao inseridos: ");
            k = ler.nextInt();
            
            for(int i=0; i<k;i++){
                System.out.printf("Insira o %d valor: ", i+1);
                entrada = ler.nextInt();
                if (entrada < 0)    c++;
            }
            
             System.out.printf("Foram inseridos %d valores negativos.", c);
        }
    }
}
