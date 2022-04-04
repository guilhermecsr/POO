/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*Imprima todos os múltiplos de 3, entre 1 e 100*/
package ex4;
import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int k=0, s=0;
        
        System.out.print("Digite até que item deseja checar: ");
        k = ler.nextInt();
        
        for(int i=1; i<=k; i++){
            if((i % 3) == 0){ 
                System.out.printf("o %d é multiplo de 3\n", i);}
            }

    }
}
