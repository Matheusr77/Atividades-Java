import java.util.Scanner;

public class Atv6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quant = 0;

        System.out.println("Vamos imprimir um padrao de numeros!");
        System.out.println("Digite o ate que numero este padrao vai: ");

        quant = sc.nextInt();

        for(int i = 1; i <= quant; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.printf(j + " ");
            }
            
            System.out.println();
        }

        sc.close();

    }    
}
