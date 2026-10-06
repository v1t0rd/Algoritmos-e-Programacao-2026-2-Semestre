import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1= 999;
        long resultado = 1;
        System.out.println("Digite um número inteiro.");
        num1=input.nextInt();

        for (int i = 1; i <= num1; i++){
            resultado *= i;
        }
        System.out.println("O fatorial desse número é: " + resultado);
    }
}
