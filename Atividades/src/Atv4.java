import java.util.Scanner;

public class Atv4 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cont = 0, num = 0, soma = 0;

        System.out.println("Digite 5 numeros inteiros: ");

        while (cont < 5) {
            
            num = sc.nextInt();
            
            if (num / 2 != 0) {
                soma = soma + num;
            }
            cont++;
        }

        System.out.printf("\nSoma total: %d", soma);

        sc.close();
    }

}
