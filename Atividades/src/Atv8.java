import java.util.Scanner;

public class Atv8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do{

            System.out.println("Digite um numero inteiro positivo: ");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Numero invalido!");
            }
            
        } while(num <= 0);

        System.out.printf("Voce digitou o numero: %d", num);

        sc.close();
    }
    
}
