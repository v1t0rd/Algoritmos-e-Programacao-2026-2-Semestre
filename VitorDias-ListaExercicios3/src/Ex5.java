import java.util.Scanner;
public class Ex5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número inteiro:");
        n = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}