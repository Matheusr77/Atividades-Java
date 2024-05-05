import java.util.Scanner;

public class Atv2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double tri, circ, trap, quad, ret;

        System.out.println("Entrada:");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("\n");
        System.out.println("Saida:");

        tri = (a * c) / 2;
        circ = 3.14 * (Math.pow(c, 2));
        trap = ((a + b) * c) / 2;
        quad = Math.pow(b, 2);
        ret = a * b;

        System.out.printf("Triangulo: %.3f\n", tri);
        System.out.printf("Circulo: %.3f\n", circ);
        System.out.printf("Trapezio: %.3f\n", trap);  
        System.out.printf("Quadrado: %.3f\n", quad);  
        System.out.printf("Retangulo: %.3f\n", ret);

        sc.close();
    }
}
