/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*Imprima a soma de 1 até 999*/
package ex3;

import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int k=0, s=0;
        
        System.out.print("Qual o ultimo elemento da somatoria: ");
        k = ler.nextInt();
        
        for (int i=1; i<=k;i++){
            s += i;
        }
        
        System.out.printf("O valor da soma de 1 -> %d é: %d", k, s);
    }
}
