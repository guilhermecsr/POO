/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*Escreva um programa que efetue a leitura de três valores reais R, S e T
imprimindo qual deles é o maior*/

package ex2;
//importação do scanner
import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex2 {

    public static void main(String[] args) {
    //declaração do scanner e variaveis usadas
        Scanner ler = new Scanner(System.in);
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
