package ex4;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int k=0;
            
            System.out.print("Digite até que item deseja checar: ");
            k = ler.nextInt();
            
            for(int i=1; i<=k; i++){
                if((i % 3) == 0){ 
                    System.out.printf("o %d é multiplo de 3\n", i);}
                }
        }

    }
}
