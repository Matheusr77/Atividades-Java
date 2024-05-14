import java.util.Scanner;

public class Atv3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double imc, altura, peso;

        System.out.println("Vamos calcular seu IMC:\n");

        System.out.println("Altura:");
        altura = sc.nextDouble();
        System.out.println("Peso: ");
        peso = sc.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        System.out.printf("\nSeu IMC: %.2f", imc);

        if (imc < 18.5) {
            System.out.println("\nAbaixo do peso");
        }

        else if (imc >= 18.5 && imc <= 25) {
            System.out.println("\nPeso normal");
        }

        else if (imc >= 18.5 && imc <= 30) {
            System.out.println("\nSobrepeso");
        }

        else if (imc >= 30.1) {
            System.out.println("\nObesidade");
        }

        sc.close();
    }
}