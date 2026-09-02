import java.util.Scanner;

public class estruturas_condicionias1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;

        System.out.println("Digite um numero. ");
        num1 = input.nextInt();

        if (num1 > 0) {
            System.out.println(num1 + " é positivo. ");
        } else if (num1 < 0) {
            System.out.println(num1 + " é negativo. ");
        } else {
            System.out.println(num1 + " é nulo. ");
        }
    }
}