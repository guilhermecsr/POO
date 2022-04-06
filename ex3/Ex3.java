package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int k=0, s=0;
            
            System.out.print("Qual o ultimo elemento da somatoria: ");
            k = ler.nextInt();
            
            for (int i=1; i<=k;i++){
                s += i;
            }
            
            System.out.printf("O valor da soma de 1 -> %d é: %d", k, s);
        }
    }
}
