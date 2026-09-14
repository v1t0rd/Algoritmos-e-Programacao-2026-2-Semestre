import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("O número " + numero + " é PAR.");
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
           
            int cubo = numero * numero * numero;
            System.out.println("O número " + numero + " é ÍMPAR.");
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }
    }
}
