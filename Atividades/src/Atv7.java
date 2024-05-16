import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um numero inteiro maior que 1 e menor que 1000:");

        num = sc.nextInt();

        System.out.printf("Numeros impares ate o %d", num);

        for(int i = -1; i < num; i = i + 2){

            System.out.println(i);
        }

        sc.close();
    }
}
