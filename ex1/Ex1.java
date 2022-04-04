/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ex1;
import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex1 {

    public static void main(String[] args) {
        //declaração do scanner e variaveis usadas
        Scanner ler = new Scanner(System.in);
        int c=0, k, entrada;
        
    //entrada do loop    
        System.out.print("Quantos valores serao inseridos: ");
        k = ler.nextInt();
        
    //loop
        for(int i=0; i<k;i++){
            System.out.printf("Insira o %d valor: ", i+1);
            entrada = ler.nextInt();
            if (entrada < 0)    c++;
        }
        
    //exibe o resultado de negativos inseridos
         System.out.printf("Foram inseridos %d valores negativos.", c);
    }
}
