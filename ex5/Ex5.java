package ex5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
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
}

