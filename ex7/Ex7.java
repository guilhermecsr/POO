package ex7;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)) {
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
}
