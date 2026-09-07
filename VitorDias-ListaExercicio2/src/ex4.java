import java.util.Scanner;
public class ex4 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = input.nextInt();
        int maior = num1;
        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }
        System.out.println("O número maior é " + maior);
    }
}
