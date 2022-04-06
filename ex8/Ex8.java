package ex8;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)) {
            int k=0, soma=0, temp=0, tru=1;
            System.out.print("Tamanho da matrix quadrada: ");
            k = ler.nextInt();
            
            int[][] matrix = new int[k][k];
            
            
            for (int i=0;i<k;i++){
                for(int j=0;j<k;j++){
                    System.out.printf("Diga o %d° valor da %dª linha: ", j+1, i+1);
                    matrix[i][j] = ler.nextInt();
                    if(i==0) soma+=matrix[i][j];
                    
                }
            }
                    
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
                for (int i=0;i<k;i++){  //coluna
                    temp = 0;
                    for(int j=0;j<k;j++){   //item
                        temp+= matrix[j][i];
                    }
                    if (temp != soma){ 
                        tru = 0;
                        break;}
                }
                
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
        }
    }
}
