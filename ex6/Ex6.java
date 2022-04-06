package ex6;

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
