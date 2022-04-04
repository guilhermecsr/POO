/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/*Um quadrado mágico é uma matriz quadrada, de valores inteiros, na qual a soma
dos elementos de cada linha, a soma dos elementos de cada coluna e a soma dos 
elementos da diagonal primária e da diagonal secundária são iguais. A matriz 
quadrada de ordem 4 abaixo é um exemplo de quadrado mágico, no qual todas as 
somas são iguais a 34:
Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n 
e imprima se a matriz é um quadrado mágico ou não.*/

package ex8;
import java.util.Scanner;

/**
 *
 * @author davi2
 */
public class Ex8 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int entrada=0, k=0, soma=0, temp=0, tru=1;
        System.out.print("Tamanho da matrix quadrada: ");
        k = ler.nextInt();
        //duas formas de resulução, com vetor de vetor ou com matrix bidimensional.
        //int[] linha = new int[k];
        
        int[][] matrix = new int[k][k];
        
        //inserir valor na matrix
        
        for (int i=0;i<k;i++){  //linha
            for(int j=0;j<k;j++){   //coluna
                System.out.printf("Diga o %d° valor da %dª linha: ", j+1, i+1);
                matrix[i][j] = ler.nextInt();
                //ja pega o valor da soma
                if(i==0) soma+=matrix[i][j];
                //System.out.printf("x: %d, y: %d\n", i, j);
                
            }
        }
        

        // ver se todas as linhas tem o mesmo valor de somatoria
        
        for (int i=0;i<k;i++){  //linha
            temp = 0;
            for(int j=0;j<k;j++){   //item
                temp+= matrix[i][j];
            }
            if (temp != soma){ 
                tru = 0;
                break;}
         }
        
        if (tru == 1){
            //ver se todas as colunas tem o mesmo valor de somatoria
            for (int i=0;i<k;i++){  //coluna
                temp = 0;
                for(int j=0;j<k;j++){   //item
                    temp+= matrix[j][i];
                }
                if (temp != soma){ 
                    tru = 0;
                    break;}
            }
            
            //zera temp e verifica se a diagonal é igual a soma
            temp = 0;
            for(int i=0; i<k;i++){
               temp += matrix[i][i];
            }
            if(temp!=soma) tru = 0;
            
            temp = 0;
            for(int i=0;i<k;i++){
                temp += matrix[i][(k-1)-i];
            }
            if(temp!=soma) tru = 0;
        }
        
        if(tru == 1) System.out.println("A matrix inserida é um quadrado perfeito");
        else  System.out.println("A matrix inserida não é um quadrado perfeito");
        
        //System.out.println("Hello World!");
    }
}
