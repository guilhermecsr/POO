/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/*O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa 
com os funcionários pedindo que cada um avaliasse a qualidade das refeições 
informando uma nota de 0 a 100. O setor quer saber o percentual de funcionários 
que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 
25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100). 
Escreva um programa que leia as notas informadas e imprima o percentual de 
funcionários que votou em cada faixa. A entrada de dados deve terminar quando
for lido um valor que não pertença a nenhum dos intervalos acima.*/

package ex7;
import java.util.Scanner;
/**
 *
 * @author davi2    
 */
public class Ex7 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int entrada=0, total=0;
        float pessimo=0, ruim=0, boa=0, otimo=0; 
        
        while(0<=entrada && entrada <=100){
            System.out.print("avaliação:");
            entrada = ler.nextInt();
            if (entrada>=0 && entrada<=25)  pessimo++;
            else if (entrada>25 && entrada <=50) ruim++;
            else if (entrada>50 && entrada <=75) boa++;
            else if (entrada>75 && entrada<=100) otimo++;
            total++;
        };
        total--;
        
        System.out.printf("\nPessima: %.2f%%\nRuim: %.2f%%\nBoa: %.2f%%\nOtima: %.2f%%\n",
            (pessimo/total)*100, (ruim/total)*100, (boa/total)*100,  (otimo/total)*100);
    }
}
