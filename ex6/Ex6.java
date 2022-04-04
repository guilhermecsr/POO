/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*Imprima os primeiros números da série de Fibonacci até passar de 100. 
A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, 
o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3)*/

package ex6;


/**
 *
 * @author davi2
 */
public class Ex6 {
    public static void main(String[] args) {
       
        int temp=0, k=1, x=0;
        
        System.out.print("Serie: \n");
        
        do{
            System.out.printf("%d\n", temp);

            x = temp + k;
            k = temp;
            temp = x;
           
            
        }while(x<100);
        
    
    }
}
