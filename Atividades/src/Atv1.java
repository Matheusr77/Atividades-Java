import java.util.Scanner;

public class Atv1 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Entrada:");

        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;

        System.out.println("Saida:");
        System.out.printf("Soma = %d",soma);
        
        sc.close();
    }
    
}
