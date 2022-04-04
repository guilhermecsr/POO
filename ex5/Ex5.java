/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*Escreva um programa recebe um valor N inteiro e que, se N for positivo, 
retorna o fatorial de N (N!). Se não for possível calcular o fatorial, a função 
deve imprimir uma mensagem e retornar o valor -1.*/

package ex5;
import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor=0, temp=0, k=0;
        
        System.out.print("Valor que deseja o fatorial: ");
        valor = ler.nextInt();
        temp = valor; k = temp;
        if(valor > 0){
            do{
                temp = temp*(valor-1);
                valor--;
            }while (valor>1);
            System.out.printf("%d! = %d", k, temp);
        }
        else System.out.println("-1");
    }
}

